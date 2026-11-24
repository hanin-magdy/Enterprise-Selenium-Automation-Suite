# Selenium TestNG Automation Framework

A test automation framework built with Java, Selenium WebDriver, TestNG, and the Page Object Model (POM) design pattern, with Allure Reports for reporting. It automates test scenarios on the practice site [The Internet (Herokuapp)](https://the-internet.herokuapp.com/).

## Features

- Page Object Model: page classes keep locators and actions separate from test code, which makes the tests easier to maintain and reuse.
- Explicit and fluent waits to handle dynamic elements and loading delays.
- Coverage of common browser scenarios: file upload, dynamic loading, alerts, hovers, multiple windows, infinite scroll, large DOM, keyboard actions, dropdowns, and modal popups.
- Allure reporting with execution status, steps, and logs.
- A screenshot is captured automatically whenever a test fails and saved under resources/screenshots.
- Custom event listener (utilities/MyListener) built on Selenium's WebDriverListener API.

## Tech Stack

- Java (JDK 17)
- Selenium WebDriver
- TestNG
- Maven
- Allure Report
- IntelliJ IDEA

## Project Structure

```text
Enterprise-Selenium-Automation-Suite/
├── pom.xml
├── resources/
│   ├── Hanin.txt               # sample file used by the file upload test
│   └── screenshots/            # screenshots captured on test failure
└── src/
    ├── main/java/
    │   ├── Pages/              # page object classes
    │   └── utilities/          # MyListener, WindowManager
    └── test/java/
        ├── base/               # BaseTest: driver setup, teardown, screenshot on failure
        ├── DropDown/
        ├── FileUpload/
        ├── Hovers/
        ├── JS/                 # scrolling tests
        ├── JavaScript/         # alerts tests
        ├── Keys/
        ├── Login/
        ├── ModalsEntryAd/
        ├── Waits/
        └── navigation/
```

## Test Modules

1. Login: valid and invalid login attempts, success message, and secure area checks.
2. Dynamic Loading: elements that render after a delay, handled with explicit and fluent waits.
3. File Upload: uploading a local file and verifying the upload result.
4. Hovers: hovering over elements to reveal hidden captions and profiles.
5. JavaScript Alerts: accepting, dismissing, and typing into native alerts, confirms, and prompts.
6. DOM and Scrolling: scrolling through a large table and an infinite scroll page.
7. Keyboard Actions: sending special keys (Enter, Backspace, arrows) and verifying the result.
8. Windows and Tabs: switching between browser windows and tabs.
9. Dropdown: selecting options by visible text and verifying the selection.
10. Modals: handling the entry ad popup and closing it.

## How to Run

1. Clone the repository:

   git clone https://github.com/hanin-magdy/Enterprise-Selenium-Automation-Suite.git

2. Open the project in IntelliJ IDEA as a Maven project and let Maven download the dependencies from pom.xml.

3. Run the tests by running any test class under src/test/java, or from the command line:

   mvn test

4. Generate and open the Allure report:

   mvn allure:serve
