____________________________________
# Don't Wreck My House 
### Dev10 Assessment: M05
#### by Chike Okonta
#### 04/19/2021
💻 Designed using Intelij

_______________________________________________________
![unusual-themed-hotels-2-1__880](https://user-images.githubusercontent.com/40407778/114541392-4bd1f380-9c1c-11eb-8ece-909e0339af39.jpg)



### Introduction
[Don't wreck my house](https://stage3talent.brightspace.com/d2l/le/content/6716/viewContent/3713/View)  
```diff
+ This is an application that allows a user to reserve accommodations for a guest with a host.
+ A guest chooses a place to stay for a specific date range. 
+ If the host location is available, it may be reserved by the guest. 
+ Reserved locations are not available to other guests during reserved dates.
```
___________________________________________________
### High Level Requirements
The application user is an accommodation administrator. They pair guests to hosts to make reservations.

- The administrator may view existing reservations for a host.
- The administrator may create a reservation for a guest with a host.
- The administrator may edit existing reservations.
- The administrator may cancel a future reservation.

___________________________________________________
### Instructions
To launch the application
- open terminal and navigate to the App.java file in the src folder
- compile the program
  -->javac App.java
- launch the program
  --> java App

#### Code Step Sequence
* [ ] Step 1 (Set Up)
  * [ ] Print header for introduction
  * [ ] Show `menu` [0-7]
* [ ] Step 2 (Perform event)
  * [ ] Get user's `response` to menu
  * [ ] Execute `event` based on user's response
    * [ ] 0: Exit
    * [ ] 1: View Forgaes by Date
    * [ ] 2: View Items
    * [ ] 3: Add a Forage
    * [ ] 4: Add a Forager
    * [ ] 5: Add an Item
    * [ ] 6: Report: Kilogram of Item
    * [ ] 7: Report: Item Category Value
  * [ ] Call corresponding layer based on requested event 
    * [ ] User Interface
    * [ ] Domain
    * [ ] Data Access
    * [ ] Model
  * [ ] Data in repository / file MUST be consistent with all `CRUD` events executed
* [ ] Step 3 (exit)
  * [ ] Exit App if `event` request is 0
  
   
  _________________________________________________________________________
 ```diff
 - CLICK IMAGES BELOW TO EXPAND
 ```
## Sequence Chart
![Capture](https://user-images.githubusercontent.com/40407778/114239940-5a828700-994c-11eb-91e0-beb4da31f61b.JPG)

Figure 1
 ______________________________________________________________________
## Flow Chart
![flowChart (6)](https://user-images.githubusercontent.com/40407778/114236959-fa89e180-9947-11eb-858a-4c65e96baf47.jpg)


Figure 2
 ______________________________________________________________________
## Example of Console Execution
![consoleExecution](https://user-images.githubusercontent.com/40407778/114225876-809e2c00-9938-11eb-90f3-33a0baf2648c.JPG)

Figure 3
____________________________________________________________________
## Time Tracker

|DATE |TASK ID|ESTIMATED TIME (HRS) | START TIME (HRS:MINS)|END TIME (HRS:MINS)| STATUS
|:---:| :---: | :---:               | :---:                |:---:              |:---:
|4.9.2021| Planning| 4              | 12:28 PM             | 4:00 PM           | Completed
|4.9.2021| Research | 1              | 4:00 PM | 5:00 PM | Completed
|4.10.2021| XML | 1              | 10:30 PM | 10:30 PM |Completed
|4.10.2021| Add a Forager| 2              | 3:00 PM | 4:00 PM | Completed
|4.10.2021| Report kilograms of each Item collected on one day  | 2             | 7:00 PM | 8:30 PM |Completed
|4.10.2021| Report total value of each Category collected on one day| 2              | 9:00 PM | 10:17 PM | Completed
|4.10.2021| Update/Fix missing item | 2              | 7:00 PM | 8:00 PM | Completed
|4.11.2021| Stretch Goals | 6              | _             | _           | In progress
|4.11.2021| Update Tests for 100% coverage| 0.5              | _ | _ | Not Started
|4.12.2021| Update Documentation, Javadoc, HTML page| 0.5              | _ | _ | In progress
|4.12.2021| Final Test: attempt to break code| 0.5              | _ | _ | Not Started


Table 1


 ________________________________________________________
### Notes
 Project will have an additional HTML page with additional explanation on methods and classes
[link](todo)

### Glossary
####Guest
A customer. Someone who wants to book a place to stay. Guest data is provided via a zip download.

####Host
The accommodation provider. Someone who has a property to rent per night. Host data is provided.

####Location
A rental property. In Don't Wreck My House, Location and Host are combined. 
The application enforces a limit on one Location per Host, so we can think of a Host and Location as a single thing.

####Reservation
One or more days where a Guest has exclusive access to a Location (or Host). Reservation data is provided.

####Adminstrator
The application user. Guests and Hosts don't book their own Reservations. The Administrator does it for them.

#### Data Information
  
  |DATA| TYPE
  | :---:|:---:
  |`Last Name`| `String`
  | `First Name` |`Integer`
  | `State`| `String`
  | `File/Path`|`String`
  | `Date`| `LocalDate`
  | `Category`| `ENUM`

Table 2


