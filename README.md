# charity-webapp
A website to help the charity

Tech-stack

Front-end
Angular: A TypeScript-based framework for building dynamic, single-page applications. Ideal for creating responsive, interactive interfaces for donation forms, event pages, and user dashboards.
TypeScript: Built into Angular, providing static typing for improved code reliability and maintainability, crucial for a charity site where trust is paramount.
Tailwind CSS: A utility-first CSS framework for rapid, responsive, and consistent styling, ensuring accessibility and visual appeal across devices.
Angular CLI: A command-line tool for scaffolding, building, and optimizing Angular applications, streamlining development and deployment.

Back-end
Java: A robust, platform-independent language for building secure and scalable backend systems.
Spring Boot: A framework for rapid Java application development, providing built-in features like dependency injection, REST APIs, and security for handling donor data and payment integrations.
Spring Data JPA: Simplifies database interactions with PostgreSQL, offering repository-based data access and query generation.
Spring Security: Ensures secure user authentication and authorization (e.g., JWT for donor accounts and admin access).

Deployment
Vercel for Frontend

Heroku/Cloudflare/GCP for Backend and Databse with PostgreSQL

Website structure:

Home
├── About Us
│   ├── Our Mission
│   ├── Our Team
│   ├── Transparency Reports
│   └── Contact Info
├── Programs
│   ├── Education Program
│   ├── Healthcare Program
│   ├── Disaster Relief
│   └── Community Outreach
├── Donate
│   ├── One-Time Donation
│   ├── Recurring Donation
│   └── Donor Recognition
├── Events
│   ├── Upcoming Events
│   ├── Event Registration
│   └── Past Events
├── Blog/News
│   ├── Success Stories
│   ├── Charity Updates
│   └── Educational Articles
├── Contact
│   ├── Contact Form
│   ├── Office Location
│   └── Support Channels
└── Get Involved
    ├── Volunteer
    ├── Corporate Partnerships
    └── Advocacy Campaigns

Folder structure for frontend 

charity-trust-frontend/
├── src/
│   ├── app/
│   │   ├── components/
│   │   │   ├── shared/
│   │   │   │   ├── header/
│   │   │   │   │   ├── header.component.html
│   │   │   │   │   ├── header.component.ts
│   │   │   │   │   ├── header.component.css
│   │   │   │   └── footer/
│   │   │   │       ├── footer.component.html
│   │   │   │       ├── footer.component.ts
│   │   │   │       ├── footer.component.css
│   │   │   ├── home/
│   │   │   │   ├── home.component.html
│   │   │   │   ├── home.component.ts
│   │   │   │   ├── home.component.css
│   │   │   ├── about/
│   │   │   │   ├── about.component.html
│   │   │   │   ├── about.component.ts
│   │   │   │   ├── about.component.css
│   │   │   ├── programs/
│   │   │   │   ├── programs.component.html
│   │   │   │   ├── programs.component.ts
│   │   │   │   ├── programs.component.css
│   │   │   ├── donate/
│   │   │   │   ├── donate.component.html
│   │   │   │   ├── donate.component.ts
│   │   │   │   ├── donate.component.css
│   │   │   ├── events/
│   │   │   │   ├── events.component.html
│   │   │   │   ├── events.component.ts
│   │   │   │   ├── events.component.css
│   │   │   ├── blog/
│   │   │   │   ├── blog.component.html
│   │   │   │   ├── blog.component.ts
│   │   │   │   ├── blog.component.css
│   │   │   ├── contact/
│   │   │   │   ├── contact.component.html
│   │   │   │   ├── contact.component.ts
│   │   │   │   ├── contact.component.css
│   │   │   └── get-involved/
│   │   │       ├── get-involved.component.html
│   │   │       ├── get-involved.component.ts
│   │   │       ├── get-involved.component.css
│   │   ├── services/
│   │   │   ├── api.service.ts
│   │   │   ├── auth.service.ts
│   │   │   └── stripe.service.ts
│   │   ├── models/
│   │   │   ├── donor.model.ts
│   │   │   ├── event.model.ts
│   │   │   └── program.model.ts
│   │   ├── app.module.ts
│   │   ├── app-routing.module.ts
│   │   ├── app.component.html
│   │   ├── app.component.ts
│   │   └── app.component.css
│   ├── assets/
│   │   ├── images/
│   │   ├── fonts/
│   │   └── data/
│   ├── styles.css
│   ├── tailwind.config.js
│   ├── angular.json
│   ├── package.json
│   ├── tsconfig.json
│   └── README.md


Folder structure for Backend

charity-trust-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/charitytrust/
│   │   │       ├── controller/
│   │   │       │   ├── DonorController.java
│   │   │       │   ├── EventController.java
│   │   │       │   ├── ProgramController.java
│   │   │       │   ├── DonationController.java
│   │   │       │   └── AuthController.java
│   │   │       ├── service/
│   │   │       │   ├── DonorService.java
│   │   │       │   ├── EventService.java
│   │   │       │   ├── ProgramService.java
│   │   │       │   ├── DonationService.java
│   │   │       │   └── StripeService.java
│   │   │       ├── repository/
│   │   │       │   ├── DonorRepository.java
│   │   │       │   ├── EventRepository.java
│   │   │       │   ├── ProgramRepository.java
│   │   │       │   └── DonationRepository.java
│   │   │       ├── model/
│   │   │       │   ├── Donor.java
│   │   │       │   ├── Event.java
│   │   │       │   ├── Program.java
│   │   │       │   └── Donation.java
│   │   │       ├── config/
│   │   │       │   ├── SecurityConfig.java
│   │   │       │   ├── JwtConfig.java
│   │   │       │   └── StripeConfig.java
│   │   │       └── CharityTrustApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   ├── static/
│   │   │   └── templates/
│   └── test/
│       ├── java/
│       │   └── org/charitytrust/
│       │       ├── controller/
│       │       │   ├── DonorControllerTest.java
│       │       │   ├── EventControllerTest.java
│       │       │   └── DonationControllerTest.java
│       │       └── service/
│       │           ├── DonorServiceTest.java
│       │           ├── EventServiceTest.java
│       │           └── DonationServiceTest.java
├── pom.xml
└── README.md


Tools required:
* JDK - Java 17/21
* IntelliJ / Eclipse
* Maven
* Github
* Postman

