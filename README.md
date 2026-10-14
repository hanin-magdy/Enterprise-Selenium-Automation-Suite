## Enterprise Selenium Automation Suite 

An enterprise-grade, robust, and highly scalable Test Automation Framework built from scratch using Java, Selenium WebDriver, TestNG, Page Object Model (POM) architectural design pattern, and Allure Reports for comprehensive visualization and logging. This framework automates and validates complex web scenarios on the industry-standard test application [The Internet (Herokuapp)](https://the-internet.herokuapp.com/).

---

##  Key Architecture & Features

- Page Object Model (POM): Clean separation of test scripts and page locators/actions for maximum code maintainability and reusability.
- Data-Driven & Robust Synchronization: Utilizes advanced explicit waits to securely handle dynamic elements and asynchronous network calls.
- Comprehensive Test Coverage: Validates multiple complex browser features such as file uploads, dynamic loading, alerts, hovers, multi-windows, infinite scrolling, DOM inspection, and key actions.
- Advanced Reporting: Integrated with Allure Framework to generate rich, interactive HTML reports containing test execution logs, execution status, and step details.
- Version Control Ready: Clean project structure optimized with .gitignore and Maven build lifecycle management (pom.xml).

---

##  Tech Stack & Dependencies

- Language: Java (JDK 17+)
- Automation Tool: Selenium WebDriver
- Test Framework: TestNG
- Build Tool: Apache Maven
- Reporting: Allure Report Engine
- IDE: IntelliJ IDEA

---

##  Project Directory Structure

```text
Enterprise-Selenium-Automation-Suite/
│
├── .gitignore
├── pom.xml
├── README.md
│
├── resources/
│   ├── categories.json
│   └── environment.properties
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── Pages/
│   │       │   ├── DropdownPage.java
│   │       │   ├── DynamicLoadingEx1Page.java
│   │       │   ├── DynamicLoadingEx2Page.java
│   │       │   ├── DynamicLoadingPage.java
│   │       │   ├── EntryAdPage.java
│   │       │   ├── FileUploaderPage.java
│   │       │   ├── HomePage.java
│   │       │   ├── HoversPage.java
│   │       │   ├── InfiniteScrollPage.java
│   │       │   ├── JavaScriptAlertsPage.java
│   │       │   ├── KeyPressesPage.java
│   │       │   ├── LargeAndDeepDomPage.java
│   │       │   ├── LoginPage.java
│   │       │   ├── MultipleWindowPage.java
│   │       │   ├── NewWindowPage.java
│   │       │   └── SecureAreaPage.java
│   │       │
│   │       └── utilities/
│   │           ├── MyListener.java
│   │           └── WindowManager.java
│
│   └── test/
│       └── java/
│           ├── base/
│           │   └── BaseTest.java
│           │
│           └── tests/
│               ├── Dropdown/
│               │   └── DropdownTests.java
│               ├── FileUpload/
│               │   └── FileUploadTests.java
│               ├── Hovers/
│               │   └── HoverTests.java
│               ├── JavaScript/
│               │   └── JavaScriptAlertsTests.java
│               ├── JS/
│               │   └── JavaScriptScrollTests.java
│               ├── Keys/
│               │   └── KeyPressesPage.java
│               ├── Login/
│               │   └── LoginTests.java
│               ├── ModalsEntryAd/
│               │   └── EntryAdTests.java
│               ├── navigation/
│               │   └── NavigationTests.java
│               └── Waits/
│                   └── WaitDynamicTests.java
```
## Detailed Test Modules & Pages Covered

1.​Authentication (LoginPage & SecureAreaPage / LoginTests):

​Validates secure login mechanisms with valid and invalid credentials.

​Asserts successful redirection and flash messages.

2.Dynamic Loading (DynamicLoadingPage, Ex1, Ex2 / WaitDynamicTests):

​Handles elements rendering asynchronously on the DOM.

​Implements robust explicit and fluent waits to handle hidden delays and loading bars.

3.​File Operations (FileUploaderPage / FileUploadTests):

​Automates local file selection and validates successful server-side uploads.

4.​Mouse Interactions & Hovers (HoversPage / HoverTests):

​Simulates mouse hovering over web elements to reveal hidden captions, user profiles, and overlay data.

5.​JavaScript Alerts & Prompts (JavaScriptAlertsPage / JavaScriptAlertsTests):

​Manages native browser dialogs (JS Alerts, Confirms, and Prompts) with text input handling and acceptance/dismissal.

6.​DOM Scrolling & Manipulation (LargeAndDeepDomPage & InfiniteScrollPage / JavaScriptScrollTests):

​Executes smooth programmatic scrolling across heavy DOM structures.

​Handles infinite vertical scrolling pages to load dynamic content.

7.​Keyboard Actions (KeyPressesPage / KeyPressesPage test):

​Sends special key strokes (Enter, Backspace, Arrow keys, etc.) and captures exact keycode responses.

8.​Window & Tab Navigation (MultipleWindowPage, NewWindowPage / NavigationTests):

​Seamlessly switches between multiple browser windows, tabs, and parent/child contexts.

9.​Dropdown Management (DropdownPage / DropdownTests):

​Selects options from native select dropdowns by visible text, 
value, or index, verifying state persistence.

10.​Modals & Popups (EntryAdPage / EntryAdTests):

​Intercepts asynchronous modal popups and handles graceful dismissal.


​## Getting Started & Execution


1.Clone the Repository:

git clone [https://github.com/hanin-magdy/Enterprise-Selenium-Automation-Suite.git](https://github.com/hanin-magdy/Enterprise-Selenium-Automation-Suite.git)

2.Open in IDE: Open the project directory using IntelliJ IDEA as a Maven Project.


3.Install Dependencies: Let Maven download and sync all required project dependencies from pom.xml.


4.Run Tests: Execute tests directly through TestNG configuration files or individual test classes located inside src/test/java/tests/.


5.Generate Allure Report:
mvn allure:serve
