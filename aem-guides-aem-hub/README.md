# AEM HUB — Adobe Experience Manager Learning Project

## 📚 About This Project

**AEM HUB** is an educational Adobe Experience Manager (AEM) project created for learning, experimentation, and hands-on understanding of AEM development concepts.

This project is **purely for educational and learning purposes**. It is designed to bring together commonly used AEM concepts in a single project so that developers can understand how different AEM modules, components, configurations, content structures, and frontend technologies work together.

The project intentionally contains **detailed comments, explanations, and examples** wherever possible to make the implementation easier to understand and follow.

---

## 🎯 Purpose

The primary purpose of this project is to provide a practical learning environment for understanding AEM development rather than building a production-ready application.

The project aims to help developers understand:

* AEM project structure
* Maven project architecture
* AEM as a Cloud Service
* Sling Models
* OSGi services and configurations
* HTL (HTML Template Language)
* AEM Components
* Dialogs and component authoring
* Templates and editable templates
* Client libraries
* Java development in AEM
* Backend-to-HTL integration
* Frontend integration
* Content packages
* Dispatcher configuration
* AEM Cloud deployment concepts
* Testing in AEM
* Maven build lifecycle
* Repository structure
* Best practices and common AEM development patterns

---

## 🧑‍💻 Educational Approach

This project is intentionally written with **learning and readability in mind**.

Where appropriate, source files contain comments explaining:

* What the code does
* Why it is required
* How different AEM APIs work
* How components communicate with backend Java code
* How Sling Models are used
* How OSGi services are registered and consumed
* How HTL interacts with Sling Models
* How AEM configurations work
* Why a particular implementation approach is used

The goal is not simply to provide working code, but to help a learner understand **why the code works**.

---

## 🏗️ Project Structure

The project follows the standard AEM Maven project structure.

```text
aem-guides-aem-hub/
│
├── all/
├── core/
├── dispatcher/
├── it.tests/
├── ui.apps/
├── ui.apps.structure/
├── ui.config/
├── ui.content/
├── ui.frontend/
├── ui.tests/
│
├── pom.xml
├── README.md
└── archetype.properties
```

Each module has a specific responsibility within the AEM project.

### `core`

Contains Java-based backend implementation such as:

* Sling Models
* OSGi services
* Servlets
* Schedulers
* Event handlers
* Utility classes
* Other backend AEM concepts

### `ui.apps`

Contains the AEM application components and application-level repository structures.

Examples include:

* Components
* Component dialogs
* HTL files
* Client libraries
* Templates
* Policies
* Repository nodes required by the application

### `ui.content`

Contains sample authorable content and content structures used by the project.

### `ui.config`

Contains OSGi and other runtime configuration.

### `ui.frontend`

Contains frontend-related source code and frontend build configuration.

### `dispatcher`

Contains Dispatcher configuration for **AEM as a Cloud Service**.

It is intended to demonstrate concepts such as:

* Virtual hosts
* Filters
* Cache rules
* Rewrite rules
* Dispatcher configuration structure
* AEM Cloud Dispatcher configuration

### `it.tests`

Contains integration tests for the project.

### `ui.tests`

Contains UI-related testing.

### `all`

Builds the complete application package by combining the required project modules.

---

## ☁️ AEM as a Cloud Service

This project is configured for:

**AEM as a Cloud Service**

The project uses the Cloud-oriented AEM project structure and includes the Cloud Dispatcher configuration.

The project does **not** include AEM Forms or Commerce functionality because the focus is on learning the core AEM development concepts.

---

## 🚫 Scope

This project is intentionally focused on general AEM development concepts.

The following are outside the scope of this project:

* Production implementation
* AEM Forms
* AEM Commerce / CIF
* Real customer data
* Production credentials
* Production secrets
* Business-critical integrations
* Production security configuration

---

## 🔐 Security Notice

This project is intended for educational purposes.

Do **not** commit sensitive information such as:

* Passwords
* API keys
* Access tokens
* Client secrets
* Private certificates
* Production credentials
* Database credentials
* Other confidential information

Use environment-specific configuration and secure secret-management mechanisms when implementing similar functionality in a real project.

---

## 📝 Code Comments

One of the main goals of this project is **learning through readable code**.

Comments are intentionally included throughout the project to explain concepts and implementation details.

When modifying the project, try to maintain this educational approach by explaining complex or non-obvious code where appropriate.

---

## 🛠️ Technologies

This project may demonstrate concepts involving:

* Adobe Experience Manager
* AEM as a Cloud Service
* Java
* Maven
* Apache Sling
* OSGi
* HTL
* JavaScript
* HTML
* CSS
* React / frontend technologies where applicable
* JUnit
* AEM Mocks
* Dispatcher

---

## 🚀 Building the Project

To build the complete project:

```bash
mvn clean install
```

The command builds the project modules and generates the required AEM packages.

For local development, deploy the generated packages to the appropriate AEM SDK instance.

---

## 📖 Learning Philosophy

This project follows a simple philosophy:

> **Understand the concept, understand the code, then understand why it is implemented that way.**

The intention is to make AEM concepts easier to learn by providing working examples instead of isolated theoretical explanations.

This project can be used as a personal learning reference, experimentation environment, or starting point for understanding AEM development.

---

## ⚠️ Disclaimer

This project is **not an official Adobe project** and is not intended to represent Adobe's production implementation guidelines in their entirety.

It is an independent educational project created for learning and experimentation.

Implementation approaches may be simplified or intentionally designed for educational purposes.

Always refer to the official Adobe Experience Manager documentation and current project-specific requirements when developing production applications.

---

## 👨‍💻 Author

**AEM HUB**

An educational AEM project created to explore, document, and understand Adobe Experience Manager development concepts through practical implementation.

---

### ⭐ Learning First

If you are using this project to learn AEM, don't just copy the code.

Read the comments, explore the repository structure, change the implementations, break things, fix them, and experiment.

**The goal of this project is not just to make the application work — it is to understand how and why it works.**
