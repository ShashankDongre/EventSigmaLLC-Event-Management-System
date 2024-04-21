# FinalProject_AED - Repository for Final AED Project
## INFO 5100 APPLICATION ENGINEERING AND DEVELOPMENT FINAL PROJECT REPORT




### Abstract: 
 
The process of creating and administering an event from an administrative and managerial standpoint is known as event management. In all circumstances, effective requirement collection and data management is necessary to ensure the success of an event. For this aim, a successful application of managing events through online solutions or web apps assists a business in achieving better outcomes and efficient administration.

An event management system for conferences, seminars, and parties is being developed to assist in the administration of corporate, personal, and technical conferences and events. This program seeks to create and implement a dependable digital platform for Event Management from numerous user viewpoints.


### Introduction:

The created application's major goal is to give a common platform for many types of end users such as corporate clients, personal clients, caterers, etc. The presence of the enterprise ‘Property Verification Officer’ and 'Court,' is the application's unique selling feature. These entities operate as approving and governing body with the ability and authority to approve or refuse permissions for event hosting,

The application use cases can be realized using two modules: 
admin and client, both having the following features:


The administration module includes the following features:

	•	Property admin can enlist and publish the list of available properties for the event hosting

	•	Property admin can delete existing properties which are not suitable for event hosting

	•	Property admin can view and track property status

	•	Property admin can update the details of existing properties


The client module includes the following features:

	•	User can log in to the application to view the list of favorable properties based on location

	•	User can select and decide on suitable properties based on their requirements

	•	User can book the property for the event

	•	User can schedule an event

	•	User can generate the ticket for the booked property

	•	Send email notifications to the users regarding their booking status

	•	Send a QR code to the users for ticket confirmation


To enable efficient and effective data storage, retrieval, and analysis, the system is built entirely in Java with its swing graphical user interface toolkit and Microsoft SQL Server as the database management system for efficient data storage and retrieval. 

 
### Problem Domain:

A variety of types of events, such as seminars, technical conferences, concerts, weddings, etc. are held in a disparate way. There are a few existing platforms where the event booking and management process takes into consideration the integration of various other players like catering, approval authorities, and other collaborative associations. However, these systems that focus on event management and booking focus on their niche and seldom offer other collaborative approaches. This could lead to poor means of multi-party integration, less efficient marketing, ineffective resource allocation, and time and resource inefficiencies in scheduling and planning a standalone event.

The developed system is a web-based application named ‘Event Sigma,’ an Event Management System specially designed to keep in mind the integration of multi-party enterprises. The digital application will serve as a communication system for specialists and administrative operational personnel. The application features modern means of information communication such as Email notifications regarding the status and tracking of event-associated updates. The application also features unique QR code generation for ease of ticket booking and tracking. Lastly, this application can also function as an aggregator of individual event-hosting platforms.


### Design, Roles, and Implementation Flow: 

Our application allows a different interface for each group of users. This implies every admin will see different application interface. This level of abstraction can be achieved using object-oriented programming concepts of Java. 

Before logging in, admins, property owners, verification officers, and corporate clients need register with the system. The username should be the user's email address. Admins, verification officers, clients, etc. can log in to the system backend via this interface by pressing the login button. They can edit and maintain their profile on the system after logging in.

Property owners can log in to the system and add their properties by entering important property information. This information includes the property name, address, hosting capacity, etc. Property owners are encouraged to provide a few sample photographs of their properties to help build confidence and make them more readily available for hosting upcoming events.

When property details are added and uploaded by the property owner, the data is sent to the property verification officer, who then examines the list of previously added properties, their details, and their status. The verification officer manually visits the property to check the authenticity of the information provided by the property owner. The verification officer can allocate other verification officers to visit the property and scrutinize the information and relevance of the data provided by the property owner. The verification officer’s choice to approve or reject a property serves as a layer of filtering based on the officer’s assessment and judgment. Once the property is authorized by the property verification officer.

Once the property has been verified by the property verification officer, it can be listed on the event hosting page. This makes them more prepared to host future events. The listed property is now available for corporate and personal event booking.

Users, corporate and personal clients, on the other hand, can now view the list of available properties. These entities can now create their own events based on their needs. This information and requirement are subsequently forwarded to the Enterprise Court for approval. The court is the presiding and authorizing body, and it considers the legal and compliance aspects related to these standards. The company can now display the event once the court has approved the event hosting standards. The 'Events' page is the landing page that was created with business and personal clients in mind. They can now view the approved properties for the purposes of searching, selecting, finalizing, and booking. The properties approved for personal events would not be displayed in the event hosting page as it serves no purpose other than the associated party. This also allows personal details of people related to events to be hidden from the rest of the users and viewers. 

Corporates and personal clients can book the venue using a QR code. Users are notified via email notifications regarding the signup and confirmation of the bookings.


### Use Cases Narratives:

In software system analysis, a use case is an approach for identifying, clarifying, and organizing system requirements. A use case is a collection of plausible sequences of interactions between systems and users in a certain environment for a specific goal. 

Some of the possible use case narratives for our application are shown in the tables below:


<img width="476" alt="1" src="https://user-images.githubusercontent.com/119814794/206940527-a92365a7-4574-499b-9cab-f43a3fd841a0.png">


<img width="458" alt="2" src="https://user-images.githubusercontent.com/119814794/206940681-28ba165e-7ffe-44eb-9b11-d7e6e26488c3.png">


<img width="445" alt="3" src="https://user-images.githubusercontent.com/119814794/206940717-61f2666f-2860-4dd6-a61a-20e7e701ac14.png">

<img width="446" alt="4" src="https://user-images.githubusercontent.com/119814794/206940741-52181d93-1d42-4754-82dd-68bd260265e8.png">


<img width="464" alt="5" src="https://user-images.githubusercontent.com/119814794/206940776-c17e1343-b5c8-449c-9926-6482e7a52f81.png">


<img width="444" alt="6" src="https://user-images.githubusercontent.com/119814794/206940791-16c9828b-1529-4c98-90ed-06f8b794bff7.png">


<img width="442" alt="7" src="https://user-images.githubusercontent.com/119814794/206940804-d0bb8f69-bc8f-4f77-8216-e21f8dce0abb.png">


<img width="450" alt="8" src="https://user-images.githubusercontent.com/119814794/206940817-33d4f1bb-b189-49e0-a524-4409177116b0.png">


<img width="443" alt="9" src="https://user-images.githubusercontent.com/119814794/206940829-48491e1d-99e7-4c67-ba9c-0109a8ae3e69.png">


<img width="364" alt="10" src="https://user-images.githubusercontent.com/119814794/206940991-9813b203-1c55-4693-9179-df92e1cd3a98.png">



### Configuration Module with Test Cases:

This chapter discusses how the system was tested, including user interface testing, code tests, bug detection, and fixes. This chapter also discusses some of the test cases, as well as the expected output.

Some test scenarios were utilized to validate the flow and working of the application, and a generalized test strategy is presented in the following tables below:

<img width="431" alt="1 1" src="https://user-images.githubusercontent.com/119814794/206945331-8db1b2d2-e7ce-47e2-9256-12dddbe3ba0e.png">


<img width="424" alt="1 2" src="https://user-images.githubusercontent.com/119814794/206945370-49c63168-8eff-4b26-9a06-5f0694752525.png">


<img width="428" alt="1 3" src="https://user-images.githubusercontent.com/119814794/206945412-4cd36da2-278e-4bb8-8446-8cab4f863bbc.png">


<img width="421" alt="1 4" src="https://user-images.githubusercontent.com/119814794/206945436-60bb4dbb-09dc-412e-9dc3-c368572d646f.png">




