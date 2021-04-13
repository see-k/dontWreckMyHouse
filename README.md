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
  * [ ] Show `menu` [0-4]
* [ ] Step 2 (Perform event)
  * [ ] Get user's `response` to menu
  * [ ] Execute `event` based on user's response
    * [ ] 0: Exit
    * [ ] 1: View Reservations for host
    * [ ] 2: Make a reservation
    * [ ] 3: Edit a reservation
    * [ ] 4: Cancel a reservation
  * [ ] Call corresponding layer based on requested event 
    * [ ] User Interface
    * [ ] Domain
    * [ ] Data Access
    * [ ] Model
  * [ ] Data in repository / file MUST be consistent with all `CRUD` events executed
* [ ] Step 3 (exit)
  * [ ] Exit App if `event` request is 0
  
  
 ______________________________________________________________________
## Example of Console Execution
![consoleExecution](https://user-images.githubusercontent.com/40407778/114225876-809e2c00-9938-11eb-90f3-33a0baf2648c.JPG)

Figure 3
____________________________________________________________________

## Project Management 
```diff
+ Use link below to go to project board
```
[Link to Public Trello Board: MO5 Mastery Project](https://trello.com/b/XkHJu36o)

## Time Tracker

|DATE |TASK ID|ESTIMATED TIME (HRS) | START TIME (HRS:MINS)|END TIME (HRS:MINS)| STATUS
|:---:| :---: | :---:               | :---:                |:---:              |:---:
|4.12.2021| Planning & Research | 4              | _ | _ | Completed
|4.13.2021| Setup Packages and models | 1              | _ | _ | Not Started
|4.13.2021| Implement Repository | 4              | _ | _ | Not Started
|4.13.2021| Test Repository| 1            | _ | _ | Not Started
|4.14.2021| First Progress presentation|0.25  | _ | _ | Not Started
|4.14.2021| Implement Domain layer | 4              | _ | _ | Not Started
|4.14.2021| Implement Test domain layer | 4              | _ | _ | Not Started
|4.15.2021| Implement View class | 1              | _ | _ | Not Started
|4.15.2021| Implement Controller class | 1              | _ | _ | Not Started
|4.15.2021| Implement App class | 0.5              | _ | _ | Not Started
|4.15.2021| Spring Annotations | 0.5  | _ | _ | Not Started
|4.16.2021| Second Progress presentation|0.25  | _ | _ | Not Started
|4.16.2021| Update Tests for 100% coverage| 0.5 | _ | _ | Not Started
|4.16.2021| Stretch Goal #1 | 4  | _ | _ | Not Started
|4.17.2021| Stretch Goal #2 | 4  | _ | _ | Not Started
|4.17.2021| Bugs: find and fix #1 | 1  | _ | _ | Not Started
|4.17.2021| Update Documentation, Javadoc, HTML page| 0.5| _ | _ | Not Started
|4.17.2021| Final Test: attempt to break code| 0.5              | _ | _ | Not Started

Table 1

  _________________________________________________________________________
 ```diff
 - CLICK IMAGES BELOW TO EXPAND
 ```
   ______________________________________________________________________
## UML Chart
 ```diff
 - Not yet Available
 ```
Figure 1
  ______________________________________________________________________
## Sequence Chart
 ```diff
 - Not yet Available
 ```
Figure 2
 ______________________________________________________________________
## Flow Chart
 ```diff
 - CLICK IMAGES BELOW TO EXPAND
 ```
Figure 3

 ________________________________________________________
### Notes
 Project will have an additional HTML page with additional explanation on methods and classes
[link](todo)

### Glossary
- Guest: 
A customer. Someone who wants to book a place to stay. Guest data is provided via a zip download.

- Host:
The accommodation provider. Someone who has a property to rent per night. Host data is provided.

-  Location:
A rental property. In Don't Wreck My House, Location and Host are combined. 
The application enforces a limit on one Location per Host, so we can think of a Host and Location as a single thing.

-  Reservation:
One or more days where a Guest has exclusive access to a Location (or Host). Reservation data is provided.

- Adminstrator:
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


