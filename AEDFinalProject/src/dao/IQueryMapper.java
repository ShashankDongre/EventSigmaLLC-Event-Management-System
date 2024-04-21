/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author Aditya Prakash
 */
public interface IQueryMapper {

    public final String FROM_EMAIL = "taxid68taxid68@gmail.com";
    public final String FROM_PASSWORD = "gkvrkifqzskqyjtd";
    public final String CLASSNAME = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public final String URL = "jdbc:sqlserver://;serverName=huskyfinder.database.windows.net;databaseName=aed_project;encrypt=true";
    public final String USERNAME = "HuskyFinderProject";
    public final String PASSWORD = "LionelMessi007#";

    public final String INSERT_PROPERTY_OWNER = "INSERT INTO property_enlist(PropertyName, Street, City, State, ZipCode, Capacity, Img_link, Img_link1, Status, Property_owner ) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    public final String INSERT_PROPERTY_REVIEW = "INSERT INTO property_review(Property_id, Property_Owner, PropertyName, Approver)"
            + "VALUES (?,?,?,?)";
    public final String INSERT_USERS = "INSERT into users values(?,?,?,?,?,?,?)";
    public final String INSERT_FOOD_ITEMS = "INSERT into food_items values (?,?,?,?)";
//    public final String INSERT_CATERER = "INSERT INTO CATERER (Package_Name, Price, Appetizer, Main_course, Dessert) VALUES (?,?,?,?,?) where CatererID = 3020";
    public final String INSERT_CATERER_2 = "INSERT INTO CATERER (Caterer_Name, Address, Phone, Ratings, created_by, created_on) values (?,?,?,?,?,?)";
    public final String INSERT_ATTENDEES = "INSERT INTO ATTENDEES VALUES(?,?,?,?,?)";
    public final String INSERT_EVENTS_HOSTED = "INSERT INTO EVENTS_HOSTED VALUES (?,?,?,?,?,?,?,?,?)";

    public final String UPDATE_CATERER_2 = "UPDATE CATERER SET Package_Name = ?, Price = ?, Menu = ? where CatererID = ?";
    public final String UPDATE_EVENTS_HOSTED = "UPDATE EVENTS_HOSTED SET Available_Ticket = ? where EVENTID = ?";
    public final String UPDATE_PROPERTY_STATUS = "UPDATE property_enlist SET Status=? WHERE Property_id = ?";
    public final String UPDATE_CATERER = "UPDATE CATERER SET Caterer_Name = ?, Address = ?, Phone = ? WHERE CATERERID = ?";

    public final String SELECT_CREATED_PROPERTY = "SELECT * FROM property_enlist WHERE Status = ?";
    public final String SELECT_PROPERTY_ENLIST_2 = "SELECT * FROM property_enlist WHERE Property_owner = ?";
    public final String SELECT_PROPERTY_ENLIST = "SELECT * FROM property_enlist WHERE Property_id = ?";
    public final String SELECT_PROPERTY_ENLIST_3 = "SELECT Property_id, PropertyName, Street, City, ZipCode, Capacity, Status, Property_Owner from Property_enlist";
    public final String SELECT_PROPERTY_REVIEW = "SELECT PROPERTY_ID, PROPERTYNAME, PROPERTY_OWNER FROM PROPERTY_REVIEW WHERE Approver = ?";

    public final String SELECT_FOOD_ITEMS = "SELECT * FROM FOOD_ITEMS";
    public final String SELECT_FOOD_ITEMS_2 = "SELECT * FROM FOOD_ITEMS where Type = ?";
    public final String SELECT_CATERER = "SELECT * FROM CATERER";
    public final String SELECT_CATERER_2 = "SELECT * FROM CATERER where Caterer_Name = ?";
    public final String SELECT_CATERER_3 = "SELECT menu FROM CATERER where Caterer_Name = ? and Package_Name = ?";

    public final String SELECT_EVENTS_HOSTED = "SELECT * FROM EVENTS_HOSTED";
    public final String SELECT_EVENTS_HOSTED_2 = "SELECT food FROM EVENTS_HOSTED where EVENTID = ?";
    public final String SELECT_EVENTS_HOSTED_3 = "SELECT * FROM EVENTS_HOSTED WHERE ADDRESS LIKE  ? and EVENT_TYPE = ? and Event_date = ? and available_ticket <> 0";
    public final String SELECT_EVENTS_HOSTED_4 = "SELECT Available_Ticket from EVENTS_HOSTED where EVENTID = ?";
    public final String SELECT_EVENTS_HOSTED_5 = "SELECT COUNT(EVENTID) as TotalEvents from EVENTS_HOSTED";
    public final String SELECT_EVENTS_HOSTED_6 = "select event_name from events_hosted where available_ticket = (select max(available_ticket) from events_hosted)";
    public final String SELECT_EVENTS_HOSTED_7 = "SELECT COUNT(EVENTID) as nilEvent from EVENTS_HOSTED where available_ticket = 0";
   
    
    public final String SELECT_CATERER_5 = "SELECT Caterer_Name, Package_Name, Price from Caterer where Price = (Select max(Price) from Caterer)";
    
    public final String SELECT_CATERER_4 = "SELECT COUNT(distinct Caterer_Name ) as TotalCaterer from Caterer";
    public final String SELECT_PROPERTY_ENLIST_10 = "SELECT count(property_id) as totalProp from property_enlist where Status = 'Approved'";

    //updated from SELECT_EVENTS to SELECT_EVENTS_IMAGE
    public final String SELECT_EVENTS_IMAGE = "Select Img_link from EVENTS where EventID = ?";
    public final String SELECT_ATTENDEES = "Select * from Attendees where EventID = ?";

    public final String DELETE_FOOD_ITEMS = "DELETE FROM FOOD_ITEMS where dish_name = ?";
    public final String DELETE_CATERER = "DELETE FROM Caterer where CATERERID = ?";

    public static String UPDATE_EVENT_STATUS = "UPDATE EVENTS SET Status = ? WHERE EventId = ?";
    public static String UPDATE_EVENT_REVIEWER_STATUS = "UPDATE REVIEWED_EVENTS SET EventStatus = ? WHERE EventId = ?";
    
    public static String INSERT_EVENT_REVIEW = "INSERT INTO REVIEWED_EVENTS (Property_Name, Location, Capacity, EventName, Description,\n"
            + "	EventType, DateOn, HostedBy, Timing, Contact, Img_link ,EventAdmin, ApprovedBy, EventId, EventStatus, rType)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
//public static String INSERT_EVENT_REVIEW = "INSERT INTO REVIEWED_EVENTS (Property_Name, Location, Capacity, EventName, Description,\n"
//      + "	EventType, DateOn, HostedBy, Timing, Contact, EventAdmin, ApprovedBy, EventId, EventStatus, rType)"
//    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static String FETCH_LOCATIONS = "SELECT DISTINCT CITY FROM property_enlist WHERE CITY <> '' ORDER BY CITY ASC";
    public static String FETCH_TYPE = "SELECT DISTINCT TYPE FROM property_enlist WHERE TYPE <> '' ORDER BY TYPE ASC";
    public static String FETCH_CAPACITY = "SELECT DISTINCT CAPACITY FROM property_enlist WHERE CAPACITY <> '' ORDER BY CAPACITY ASC";

    public static String INSERT_SELECTED_PLACES_FOR_EVENT = "INSERT INTO SELECTED_TABLES_FOR_EVENT VALUES(?,?,?,?,?,?)";

    public static String SELECT_EVENTS = "SELECT * FROM EVENTS WHERE EventAdmin = ?";

    public static String SELECT_EVENTS_1 = "SELECT * FROM EVENTS";
    public static String SELECT_EVENTS_2 = "SELECT * FROM EVENTS WHERE request_type = ?";
    public static String SELECT_REVEIWER_EVENTS = "SELECT * FROM REVIEWED_EVENTS WHERE ApprovedBy = ? ";
    public static String SELECT_REVEIWER_EVENTS_1 = "SELECT * FROM REVIEWED_EVENTS WHERE ApprovedBy = ? AND EventStatus = 'Created'";

    public String SELECT_REVIEWED_EVENTS_2 = "SELECT EVENTID, EVENTNAME, PROPERTY_NAME, LOCATION, EVENTTYPE, HOSTEDBY, EVENTADMIN, DATEON FROM REVIEWED_EVENTS WHERE EVENTADMIN = ? AND EVENTTYPE IN (?,?,?,?,?)";

    public static String CREATE_EVENT = "INSERT INTO EVENTS VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public static String DELETE_EVENT = "DELETE FROM EVENTS WHERE EventId = ?";

    public final String SELECT_CREATED_PROPERTY_FOR_EVENT = "SELECT * FROM property_enlist WHERE Status = ? "
            + "AND property_id NOT IN (SELECT propertyid FROM SELECTED_TABLES_FOR_EVENT)";
    public final String SELECT_SHORTLISTED_PROPERTY = "SELECT * FROM SELECTED_TABLES_FOR_EVENT WHERE Eventadmin = ? ";
//            + "AND property_id NOT IN (SELECT propertyid FROM SELECTED_TABLES_FOR_EVENT)";

    public final String SELECT_USERS = "SELECT First_name, role FROM users where email_id =? and password = ?";
    public final String SELECT_USERS_2 = "SELECT email_id from users where email_id = ?";

}
