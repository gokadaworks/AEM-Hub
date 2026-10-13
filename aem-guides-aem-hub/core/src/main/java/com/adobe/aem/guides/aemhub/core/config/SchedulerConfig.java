package com.adobe.aem.guides.aemhub.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition (name = "Scheduler Configuration OCD", 
description = "Simple Scheduler Configuration to avoid the white board pattern")
public @interface SchedulerConfig {
    
    @AttributeDefinition (
        name = "Scheduler Name",
        description = "Scheduler Name",
        type = AttributeType.STRING
    )
    String scheduler_name() default "AEM Hub Scheduler";

    // cron job for every minute
    @AttributeDefinition(
        name = "Cron job expression",
        description = "Cron job expression",
        type = AttributeType.STRING)
    String scheduler_expression() default "0 * * * * ?";

    @AttributeDefinition(
        name = "Enable Scheduler",
        description = "Enable Scheduler",
        type = AttributeType.BOOLEAN)
    boolean enable_scheduler() default true;

    @AttributeDefinition(
        name = "Concurrent Scheduler",
        description = "Concurrent Scheduler",
        type = AttributeType.BOOLEAN)
    boolean concurrent_scheduler() default false;

    @AttributeDefinition(
        name = "Custom Property",
        description = "Custom Property",
        type = AttributeType.STRING)
    String customProperty() default "Test";
}
