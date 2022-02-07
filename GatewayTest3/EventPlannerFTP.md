# GatewayTest2 - Functional Test Plan
Functional Test Plan for EventPlanner Gateway Test  
- **Start date**: 10-01-22  
- **Due date**: 10-01-22  
- **Main Author:** @ku63026  
- **Collaborators (optional):**  
  - @ku13043, @ku17655    
- **Repository:**
[GWT2EventPlanningSolution](https://gitlab.kingston.ac.uk/CI5105-2021-22/GWT2EventPlanningSolution.git) 

# 1 GatewayTest2 - EventPlanner

An example functional test plan for the GatewayTest2 - JCF

[GatewayTest Past Paper on Nooblab] (https://www.nooblab.com/NoobLab/contents/kunet.kingston.ac.uk/ku63026/CI5105/scrabble6x9old/)

This markdown document is an example of a Functional Test Plan as applied to the EventPlanner GatewayTest Questions
Each Question is regarded as a Requirement for purposes of the example

# 2 Requirements

These are the questions: Q[Section][Number] 

* QA1 - Define EventPlanner-Event Relationship
* QA2 - EventPlanner Constructors
* QB1 - Add new Event to Event Planner
* QB2 - Only add Events not in List
* QB3 - How many Tickets Sold
* QB4 - Another requirement
* QB5 - Yet another requirement

## 2.1 Requirement QA1

| **QA1** |   **Define EventPlanner-Event Relationship**    |
| ------ | ------------------------------------ | 
| **Description**      | Define a relationship between `EventPlanner` and `Event`  | 
| **Pre-condition**     | `Event` Class is pre-defined and tested. `EventPlanner` is a skeleton class   |      
| **Post-condition**      | There is a 1:Many Association between `EventPlanner` and `Event` with a `null` `List<Event>` in *events* attribute  | 
| **Design notes**     | The association needs to be: |
||1. defined from `EventPlanner` to `Event` |
|| 2. implemented as `private List<Event>` attribute called *events* | 
|| 3. Access Methods required |
||4. List must be implemented declared but not implemented i.e. initially `null` |
| **Parameters**      | `List<Event> events` for setter |    
| **Step sequence**      |  Setting up the Association according to the specification |
||1. Define attribute `private events List<Event> ` in  `EventPlanner`|
||2. Implement `EventPlanner` access methods - getter: `public List<Event> getEvents()` returning  *this.events* | 
|| 3. Implement `EventPlanner` access methods - setter: `public void setEvents( List<Event> events)` setting  *this.events* | 
| **Success**      | An `EventPlanner`instance can be associated with a pre-defined `List<Event>` implemented as an `ArrayList` |
| **Tests**      |  Testing the association |
||1. Test an `EventPlanner` instance has an `List<Event> events` attribute that is null: `testAQ1EventPlannerGetEventsNull`  |
||2. Test an `EventPlanner` instance has a working getter method: `testAQ1EventPlannerGetEventsNull` | 
||3. Test an `EventPlanner` instance has a working setter method: `testAQ1EventPlannerSetEvents` | 
||4. Test an `EventPlanner` instance can be associated with a pre-defined `ArrayList<Event>`: `testAQ1EventPlannerSetEvents` | 
| **Errors**      |  |
||1. The `events` attribute might be incorrectly named|
||2. The getter and setter methods might not follow the naming conventions|
||3. The getter and setter methods might have incorrect method signatures|
||4. The getter and setter methods might not operate correctly|
||5. There might be future issues if a none `ArrayList` implementation of `List<Event>` is used|
||6. There might be future issues if events is either `null` or *empty*|
| **Alternative Flows**      | How exceptions/errors are handled |
||1. Testing modified to use reflection to check all naming conventions and method signatures are correct before deployment|
||2. Null pointer exceptions are trapped to prevent runtime errors caused by *events* being `null`|
||3. All implementing methods/requirements need to account for the possibility of an empty `List<Event>` |
||4. All implementing methods/requirements need to account for the possibility different `List<Event>` implementations or `ArrayList` needs to be enforced  |

Table 2.1 Requirement QA1

## 2.2 Requirement QA2

| **QA2** |   **Define EventPlanner-Event Relationship**    |
| ------ | ------------------------------------ | 
| **Description**      |  `EventPlanner` constructors  | 
| **Pre-condition**     |  `EventPlanner` is defined with is a 1:Many Association between `EventPlanner` and `Event` with a `null` `List<Event>` in *events* attribute and associated getters and setters according to **AQ1** |      
| **Post-condition**      | There are 2 constuctors for `EventPlanner`. A default constructor which initialises an empty `ArrayList<Event>` and a parameterised constructor that takes a pre-defined `ArrayList<Event>`| 
| **Design notes**     | The assumption is that the List<Event> events attribute will be implemented as an `ArrayList` |
| **Parameters**      | `ArrayList<Event> events` for the parameterised constructor |    
| **Step sequence**      |  Defining the constructors according specification |
||1a. Define the default constructor `public EventPlanner()`|
||1b. Initialise the *events* attribute with a `new ArrayList`|
||2a. Define the prarameterised constructor `public EventPlanner(List<Event> events)` | 
||2b. Assign *events* to *this.events*   | 
| **Success**      |  `EventPlanner`instances can be constructed with an initialised `List<Event>` implemented as an `ArrayList` either empty or from a pre-defined `ArrayList` |
| **Tests**      |  Testing the constructors work as specified|
||1. Test an `EventPlanner` instance using the default constructor has a `List<Event> events` attribute that is empty: `testAQ2EventPlannerDefaultConstructor`  |
||2. Test **AQ1.1**  `testAQ1EventPlannerGetEventsNull` should now fail because the in-built default constructor should have been replaced | 
||3. Test the parameterised constructor assigns a pre-defined `ArrayList<Event>`: `EventPlanner` instance has a working setter method: `testAQ2EventPlannerParameterisedConstructor()` | 
| **Errors**      |  |
||1. There might be future issues if a none `ArrayList` implementation of `List<Event>` is used|
||2. There might be future issues if events is either `null` or *empty*|
| **Alternative Flows**      | How exceptions/errors are handled |
||1. The possibility of events being `null` should be trapped in `setEvents(List<Event> events)` and `Events(List<Event> events`. No events or clearing events could be handled by an empty `List<Event>`  |
||2. All implementing methods/requirements need to account for the possibility of an empty `List<Event>` |
||3. All implementing methods/requirements need to account for the possibility different `List<Event>` implementations or `ArrayList` needs to be enforced  |

Table 2.2 Requirement QA2

## 2.3 Requirement QB1

| **QB1** |   **Add a new Event to the EventPlanner Event List**    |
| ------ | ------------------------------------ | 
| **Description**      | The functionality of the `EventPlanner` class is extended so that a new `Event` can be added to the `List<Event>`  | 
| **Pre-condition**     | An `EventPlanner` instance exists with *events* being either *empty* or *non-empty*. An `Event` instance exists that is not `null` and should be added to the  `EventPlanner` instance.|      
| **Post-condition**      | *events* should now contain one more Event which is the added `Event`| 
| **Design notes**     | The behaviour should be: |
||1. The new `Event` is added to the end of the List  |
|| 2. No change is made to the previous `Events` in the `List` | 
|| 3. Currently no consideration is made about whether the added Event already exists in the List |
|| 4. The assumption is that *events* is not `null` this should really be enforced in **AQ1** and **AQ2**  |
| **Parameters**      | `boolean addEvent(Event event)` for the new method|    
| **Step sequence**      |  Implementing `addEvent` |
||1. Add the `Event event` to *events* |
||2. Return `true` if added `false` if not| 
| **Success**      | the number of *events* has increased by one and now contains the added `Event`. All other `Event`s have remained unchanged |
| **Tests**      |  Testing the `addEvent` method |
||1. Test *events* `EventPlanner` instance contains the added `Event`: `testBQ1EventAddedContains()` |
||2. Test *events* `EventPlanner` instance has increased in size by one: `testBQ1EventAddedSize()` |
| **Errors**      |  |
||1. The `Event`instance being added could be `null` |
||2. The *events* could be `null` |
| **Alternative Flows**      | How exceptions/errors are handled |
||1. If the `Event`instance is `null` then this should not be added  |
||2. The possibility of events being `null` should be trapped in `setEvents(List<Event> events)` and `Events(List<Event> events`. No events or clearing events could be handled by an empty `List<Event>`  |

Table 2.3 Requirement QB1

## 2.4 Requirement QB2

| **QB2** |   **`addEvent` should not add an Event that is already on the List**    |
| ------ | ------------------------------------ | 
| **Description**      | The behaviour of `addEvent` is modified so that it will not add a duplicate `Event` that is also in the *events* `List<Event>` .  **QB1** is modified| 
| **Pre-condition**     | An `Event` instance that exists that is not `null` is created. An `EventPlanner` instance is created with a pre-existing `ArrayList<Event>` that contains the   `Event` instance.|      
| **Post-condition**      | the duplicate `Event` should not be added to the *events* `List<Event>` | 
| **Design notes**     | The behaviour should be: |
||1. QB1 should not change for a new unique `Event`  |
|| 2. No change is made to the previous `Events` in the `List` | 
|| 3. The assumption is that *events* is and the Event instance are not `null` this should really be enforced in **AQ1** , **AQ2** and **QB1**  |
| **Parameters**      | `boolean addEvent(Event event)` as in **QB1** |    
| **Step sequence**      |  Implementing `addEvent` |
||1. Check if `Event event` is already in *events* |
||2. Don't add the duplicate `Event`| 
||2. Return `false` if the`Event` is a duplicate| 
| **Success**      | the number of *events* remains the same size and the duplicate `Event` is not added. All other `Event`s have remained unchanged |
| **Tests**      |  Testing the `addEvent` method with a duplicate Event |
||1. Test *events* `EventPlanner` instance contains the added `Event`: `testBQ1EventAddedContains()` |
||2. Test *events* `EventPlanner` instance has increased in size by one: `testBQ1EventAddedSize()` |
| **Errors**      |  |
||1. The `Event`instance being added could be `null` |
||2. The *events* could be `null` |
| **Alternative Flows**      | How exceptions/errors are handled |
||1. If the `Event`instance is `null` then this should not be added  |
||2. The possibility of events being `null` should be trapped in `setEvents(List<Event> events)` and `Events(List<Event> events`. No events or clearing events could be handled by an empty `List<Event>`  |

Table 2.4 Requirement QB2

## 2.5 Requirement QB3

| **QB3** |   **How many tickets sold?**    |
| ------ | ------------------------------------ | 
| **Description**      | A method `int totalTicketsSold()` should be implemented so that it returns the total tickets sold in all the *events* of `List<Event>`. | 
| **Pre-condition**     | An `EventPlanner` instance is created with a pre-existing `ArrayList<Event>` that contain a number of `Event` instances that have a random number of `ticketsSold` that don't exceed the `Event` capacity.|      
| **Post-condition**      |The `totalTicketsSold()` method should return the number of `ticketsSold` in all the `Event`s in the *events*| 
| **Design notes**     | The behaviour should be: |
||1. `totalTicketsSold()` should iterate through *events* and sum up the amount of ticketsSold|
| **Parameters**      | no parameter in `int totalTicketsSold()` |    
| **Step sequence**      |  Implementing `totalTicketsSold` |
||1. Setup a running total and initialise to 0|
||2. Iterate through each `Event` in *events* | 
||3. Get the `ticketsSold` and add to the running total| 
||4. Return the running total| 
| **Success**      | `totalTicketsSold()` equals the sum of the ticketsSOld in each `Event` |
| **Tests**      |  Testing the `addEvent` method with a duplicate `Event` |
||1. Test `EventPlanner` `int totalTicketsSold()` returns the correct number of ticketsSold: `testBQ3TotalTicketsSoldCorrect()`|
| **Errors**      |  |
||1. One `Event`instance could be `null` |
||2. The *events* could be `null` |
||3. `ticketsSold` in one of the *events* could be invalid (negative or exceed capacity)|
| **Alternative Flows**      | How exceptions/errors are handled |
||1. The possibility of `Event`instance being `null` should be handled by **AQ1**. **AQ2**, **BQ1**  |
||2. The possibility of `ticketsSold` being invalid should be handled by the behaviour of `Event` |

Table 2.5 Requirement QB3

