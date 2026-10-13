package com.adobe.aem.guides.aemhub.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import com.adobe.aem.guides.aemhub.core.config.SchedulerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component (service = PrintScheduler.class, immediate = true)
@Designate (ocd = SchedulerConfig.class)
public class PrintScheduler implements Runnable{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintScheduler.class);

    @Reference 
    Scheduler scheduler;

    @Override
    public void run() {
        LOGGER.info("------RUN METHOD EXECUTING------");
    }

    @Activate 
    protected void activate(final SchedulerConfig config){
        LOGGER.info("-----------Scheduler Activated--------------");
        addScheduler(config);
    }
    
    public void addScheduler(SchedulerConfig config){
        if (config.enable_scheduler()){
            ScheduleOptions options = scheduler.EXPR(config.scheduler_expression());
            options.name(config.scheduler_name());
            options.name(config.scheduler_name());
            options.canRunConcurrently(config.concurrent_scheduler());
            
            scheduler.schedule(this, options);
            LOGGER.info("----------Scheduler added successfully, name='{}'", config.scheduler_name());
        }
        else{
            LOGGER.info("Scheduler is disabled, please turn on........");
        }
    }


    @Deactivate 
    protected void deActivate(SchedulerConfig config){
        removeScheduler(config);
    }

    public void removeScheduler(SchedulerConfig config){
        scheduler.unschedule(config.scheduler_name());
    }

    @Modified 
    protected void modified(SchedulerConfig config){
        if (config.enable_scheduler()){
            addScheduler(config);
        }
        else{
            removeScheduler(config);
        }
    }
}
