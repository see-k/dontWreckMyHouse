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
#### Making Reservations
![x1](https://user-images.githubusercontent.com/40407778/114550371-b9375180-9c27-11eb-97cb-5cb29e2c95df.JPG)
#### Changing Reservations
![x2](https://user-images.githubusercontent.com/40407778/114550377-bb011500-9c27-11eb-8f87-d313621760e2.JPG)

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
|4.12.2021| Planning & Research | 4              | 2:00 PM | 4:00 PM | Completed
|4.13.2021| Setup Packages and models | 1              | 10:00 PM  | 10:25 PM | Completed
|4.13.2021| Implement Repository | 4              | 11:00 PM | _ | In progress
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
![ClassDiagram](https://user-images.githubusercontent.com/40407778/114618692-43ef6f00-9c6f-11eb-8a35-7d40a36be57b.JPG)

Figure 1
  ______________________________________________________________________
## Sequence Chart
 ```diff
 - Not yet Available
 ```
Figure 2
 ______________________________________________________________________
## Flow Chart
[Link} (https://viewer.diagrams.net/?highlight=0000ff&edit=_blank&layers=1&nav=1&title=classDiagram.drawio#R7V1bd6M4Ev41Obv7EI5uSPCYS992OzO9ne7pnUdiq20m2HiAJJ359SsBwlwkwI5xcA995pwJssRF%2BqrqU6lKOsNXqx%2FvIm%2BzvAnnPDhDYP7jDF%2BfIYSgQyyHir9k4XNWCG1CLJtlhYvIn2fFYFtw6%2F%2FF87qq9MGf8zgvy4qSMAwSf1MtnIXrNZ8llTIvisKnarXvYTCvFGy8BW8U3M68oFn6zZ8ny6yUQLwtf8%2F9xTJ%2Fsu3kP9x5s%2FtFFD6s88edIQwovEIk%2B3nlqVvl3xkvvXn4VCrCb87wVRSGSfbX6scVD2QPq1779uH5W%2FDxnr7793%2FjP72vl%2F%2F58stv59nN3u7SpPjAiK%2BTvW%2F9P%2Fj0GyLzm%2Bund39%2BXZC72dOvj%2BdOfu9HL3jgqhvSj02eVf%2FKPtrk1XiU8B%2B6UfXuVHXQ821h0YUCoDxc8SR6Fu3yu5%2Fno5Dj8tzF%2BfOetkOMoZ2VLUvDCxHJm3o5rhbFzbe9I%2F7IO2iXzkLdnSVAspF%2FShTz6Axffg%2FXyW3%2BOxTX8cab%2BevFl3AjC4AoEX2ncEvy6wKvkGQFn8LYT%2FxwLYoC%2Fl38crlMVoG6ZRKF9%2FwqDMIofQkMkANckD%2B8VP6GvL1%2BI1t894OgVJ79E%2BXGUS6PZguQmsP5msOFG8OV6sC4MWjia5NGP67DNa91VV5U6vp0dDONiIhmtGVX%2BkJVXQT%2BQg7eyp%2FP5Y%2BXXl4wE91a4EQ3VIcfkvw2zKlIGHQtghzHJi5gYqiEcWjIG2RAM4DMAi7DrmjjYIoJYUMNJ2kM5%2FswTpoS%2BOSvAi8bu9JoSHGYLf1g%2FtF7Dh%2Fky8eJMADq6nIZRv5for63lSovKsaWGpBQNLqVN8sfE%2FFYNPukxgfWim68H5WKH704US8YBoG3if27AkArL1r468swScKVaiVNFp%2FnV%2FE9T2bL%2FMIEIrOGGAxeqAov27ZcmyGKmY0ZdZVxLqELEaeJLkKZ5bqMOIQ5QlUoDXx4cNka1X4pX0ZA7INoeSH%2Bfvf1g%2FhBMCYMs66TFQIxer94K55VuU0iodwblfjK84PWGp%2BWKaJaanjzucBL3Fpn5ifPrRUEqJP2x2zEB3sC5%2FP2aqLSeu5F889d93vi%2FJ6v2%2Bu9TB0rVZobxrrKTaSlVWb3Y1rnmmxLPudgk0WhaPs9SDneUihqvk6lTXRZzm7k225Cf52k8LMvxX9CI14Byz6zxYtfiWu4vRb%2FyeqRkMi1%2BBbPT8WJC7w8cSnxQ6h8opfJXAgR7Sd1EDkWYSWpswcSOwh1lErCZsGT96no%2FVNc%2FKsVYaLqx1wIe1V%2BI4WxV81UKHvVvMiEs1fdKyGkvSreSmHt96KF0Pa9cSG8vRp82wpxd%2F24GLq83mMoQKCppRk1U9X6mJnq1UfMVK85XqaatdEyVauPlfEFdSPVclPdOJmq60epUXvStsfRttAmWi3apX0xxJY9GNFxGwr33QOfaPRoabRbo9HNaZkgyU0QIZdZ1CEOExM9ihiAA%2BHJBSYDLlGlmPMHMcldiGluXWl996Me7PlAFHvTSbHb2fGkNw%2BlN93dWaoG4o5tQUAhILYAukD4UH4kCKmZpL7LYF6ytyasi8pvFdxPg9T25J%2BxrhdMHEXXBSPkh510btILR9cLEEKtwHfpCehQy2YOo4wBxlzXxUPZwqaH8jOPefTopa77iWGNkmFhUGFYDnP7wQor38XhcWRyRvoddCpFwnWXR05METvrZOztuv1xSZiC0FRl0osH0ovuHl49HV%2BiQxEkZAKsIBF9udGtwm4%2FupNhuFfdjJxc93uNLxLTParGvB%2Ff0X2WkcQ0PspUs%2FlJppr175m8Qa8kpYWru3PmDsBQdqXp%2B2mM%2F6sEe0DkVFcLz5lyjJV6iwJXQ%2B4AHmpxAvXorr9ruIdroOqvOFy46Ym6DsW0sEm8f85wD9OQKEei7ViuSyFxiQsww6wicBhZNiCOTTB1XIyAJvgDMgsRB0AHCg1FbKzRXNQq3QI7g63WQ0VlqjOtjdD1fJpmvdI0qwN%2FmAILAOQyBBwbO7YaQjXtIgKdNrIxcBgAUK1%2FlI0lENN%2FolEpeKj5PHSYgdeueBynUamSUl1Ekff80ZdrKDSQ0Cmo6CKZKNYhVVwu9zvNhAyoIcPpJscAGj%2B%2BfZjNqqvOd2EYcG%2BtneJEURjdlIHWhrFmsFCzfcb9JzQeCY20SWFNaKSDBdho1ueEpXwIpgXfsdpJhtvsJKa4aijHYCddXRZBuuTqPQehl3stv0y653C6xwV6FI3JErrIAAu5Cpkho2QKv2jX68oAmuzXUTE0DvvVTOJoQICv5xcyj0xc3QWhNCeXcy9epqpedpH4%2Fa0vn5uOibjKrRNEzdn9blag5lh5S%2BxL6spn%2FPCT%2F6nnib9%2Fl3%2BLgc6urn%2BUfrp%2BLt5LdJhsdC4mShCqkqwpZkgVbFunV5Xmn3jki46XHobrrZXi80YCXS8bJTo5fIhmvI%2BMC6MvpLqbF7e6jCDN2UrEAy%2FxH6tvrQNXfrtPUs5K%2FkRaNZrIrblUs%2B%2FKW20h2rgRRh03yj67caN0SliqlusB4wsjFZaXP4dQ0vpe9fqQsZqoZW%2BwFbyiw18ii%2FoMnFsePfqzyfEyUkKJap4%2B1p8aIDxYTJVxjTviG%2Bn8DqM8kUUi7PO2bDL%2FhzP%2Fuy8rH59CmkLvvHmZO6opbeYbydICDZ4RcSd%2FLldZd2l6Xmr4y0MQxHu3fuvzYN6n%2BRU6uwCagNn1%2FPK5Hu1Wdgy1fnzWvB7cZmyuf4eHzbzaPm9TrRXxlRCRRq1JfI8kvjuw94IuDSC%2FhnSDiTOcEmeAgI2AMxSBEZ2cIYXYRBoG0Tq7x%2B4fmzQgYHJHtpGGPAtqL9ZgatuTNvRp3sYbqu33JQ7tHdDNHPq8RYM6qEYd3EGfojaJ8VBiPArygEDTf1yKp58oxKgphKIBClFUk63xChRC507WUYgS0CYiMYAGyoV75ESi6fDsJhKVlJ%2Bf2AlRCT%2Fv7YGYnAenIH2jsP8Q6CKpMowtYQlhaYkYpkLersP1P%2BRqybeIC6OMwM1zCqEHGR2a1RYvVG5QKm7e2fSsEhTpnw%2BhGqnzOOUMErUQbX6I%2F6UtQfrbU95z8td1GK0E2ygaq6fcybe9Wvr34m3Br%2FeSXnS89l3U60Pm%2FqMqAsSCyBIwgKUWpd81TVof1t70rZQVBGZLwajE%2F%2BeC9izWaZeIe4Fr%2Fii3Eu15r4s45nG84uly2A2ws768EdLCUwR%2FikK5yegRvurL0o%2BlsEXhH%2BkTZXZEIqRXFiZLnn5fIL48jdMDf3iPXiqas3tvwePeT5F6W8Wx79BE7XS4y1OE%2FrpIAxR3avY1lulRaaLUd0%2FyceqtpCZd38Wblu7U63JjmoNZref6WRTY26ss3%2BI8lb2npZ%2Fw242XLmQ%2FRd7GqMF35tW9NPA%2Bu59iUvXAyZ2ymhugajdkLHbeO7xCJjoHXG0gXyWBCAEGa%2F0F3KYNY%2Bp9qykp9nAd1mN73b9rClGOJrMMQFCdQmKMGiNKtdvXDTmiTZ%2BE1Jsv5aYnkmPUOWYEWHIrWQZsm7iI1gaQIst2kC1mbAw6xU6xZYWGXQsAjF1mA4e4mGlGF1HLhYiKurYrI3Tc4ca66SyQ85C3fsBbfAKT%2F%2Bk4%2FqdOLDpIbh0LEHMhoUIVV8FIHBlIzSh1XYAEoGxTJDUgiLrIxS4imv2rESQWdhxMXBsSm%2BKWWLUXgtHki3j%2F5uL6zefWJHiBHDH28rPKlabZ9MG0Im6dTRt9We3Qsm0LVPIpB4OWKc3tKRLM%2BSLo3FhpLl1evkDEX52eHV3FCZBHBqQDtcjaEZ8QY0uYagcomz4UPm2NH0h6Ji99SXTSSae4vCw7GzuiBicbPQ4bjVxpox0onsQcBzKGqzYaMEEHCbOZgKxtY6xbQ0IWY2IaQHOw6taTALEogC6BLLvXYEDV7RjRXC%2FQKkbpVJeqdr%2BYvNwl3%2BsprxsAqN1Dr%2FmcyRYcyhbYhryLNnLSLVOQOceRKXqaCUAqmadIzSmlALVl8eSJQ%2FCsf%2BJQ1h27J%2FkU7rzuLB%2FFELuzfOzujWEOluWDsEWRTaHNKLYJVduNqK2SEa3saVK9fe8MIChIDsQUOY4wVNhGZIeHGLKDDpaQw5ruxTRSavJQnAT7OWfQQk7JQ1FN6mKOLZ1hqZcLA%2BCaYnBH4qBgTc%2Fo5KAYCQdghuWTE3FQMFPU1uSg%2BDkBeWIOCpVSOXHUwThqN%2FNkdl82ywzesUE4apUvOurQ3F156Hl6KJcLXZsAhFzHsauZ6VCIgMUwcygBTK5q1MA%2BOBXVLE90%2BOi6snQmmjoOmoqFqm1x0lHXsbALKHMphNQGunW0EfnomCnxvOqj0yemKCed3nXWPw%2FnQ79HvXrCzeSsOzYv2iMnf0TOOtZcSSyFw09uiZPQ9%2BfpFnPGwAkIoW1ReDp%2BCdN%2BnJNf4vXVHTttv4RpvW%2FyS%2FycgDwxv4TTI1578ksMvHamlESPHfLQ0fwScmNFatWC5gVPpMKy7%2BmgINBxLYoKB0Vt31rkQgsT5Z84snfC0cThd3gn%2BiUAT5x1HJwVA9dCztZHUUMfBEgGlm%2BdFCMPJFJL2d2Jx6VU411cFbok5d4Oi7bHNhwObZUbbgdT5cn5cJT97PdYJRyP8wGB5ipMwL1obUUth3CefJ7OPsdtEWzLs4CKf41cQyA9AFRMpASdhcBtunQJcS279E97PqblEib5gLQA2FaLZAMMfNPrdLHZTLZ6eFu9D%2FiAU10%2FOHeN06gmqAY7wxIB01w%2BTb2e9p8fYhOKPb0%2FTVhQMBQs1HptecYsZotKeYgOW4aLcO0Fb7all7OH6LGQw61UwrpUblt%2FDLPsXlH4B0%2BS51y9eA9JWLU6hslxZWqMESlNlmVvpknB2h3iDzdt7zGVNquLHhPpQkI7J9LIEIPae878QsjA04MMwTKOtfSP%2Fp3xgwwh8y90usiATrtq%2BxisnZwxsCcEQXp64Ky6%2BmxMfwIw9nYKEgOdOpYyc0aGF3WyisWUZ%2Ff30k%2BGo1XERR0rW%2BBtbeXvZVDucs7K6QBPeZZeTwnSuhLEkInZ5vaf3U8l7nzGisrOqB2EYXJoM3XWi77%2BMGesIJUDMBZ5G%2BBMJOtlgnscCTk47iEFVZ80csggOId2baML1H6WUOPFag0GAjoa28SqgCeaDMuQhuXljGYvsWBVo0Py9zWesIXUoZb6BkNJhW4rjpqYvMoOa7gW9XvONBvmOFhzKjwEZKgAh2Kru2l%2FNSOWWsMJxIBZ5Vk%2F1A4frdCzwdZvUNMD%2B%2FVDYzhPfsFmt8Eq8khoZcVGbdCruASSmaKMEOY6jguKkKKxrtjgZhD%2BlejTKAwCuZnotHDzKkEWXSC0azMoqvPQYwEz1sSWQPBgYDKdEbcsHU5ZBFYWx0bUYhEW5WOptjkQpupR8yCKegSD6YCKacVob4BmemOnFSMDHikZDI6m3dSih3VXPLCocrHZyDlLV0058%2Biq8%2Bjzp646K%2B%2Bedz5r3v2smbee8Wa88wT9I0FfOat6QB%2BiwVSxYvojn9QX83jtpP6oc%2B72aWD3OoKKnej255r2BDzSQgI5jYWEdmjsG5r%2Bs0KKviqkcHP2%2F5swedP8YaTzB5kCQGrJ4zsE%2BQx4LBg2BX9Np5Efjd%2FssU3hsc8D055%2FoQ3Ln04jn04jn8S3pOfHcKAY0hzHciN654avH37dSJdNPHGHkXIHqA6DVRldjum8hqMSB81xMJnCqeIq0zlv1g%2BrSeccTueYFpJHRRlMWxeKqdVvsqxkk%2BQRagu5%2FlF3TfPkhsext9Dl%2Ftfq%2BvH7dDBLNe%2FCMODei1OfJuT1Rt5IrF1zSzbZRQIMH36d7NxI7Rxh1ajDYkulV7Zzpl3T4pm3XstF8VQn5ReTpjmcptljQ7Cj2zjTAuxGmKgk6F714t78M%2F%2FzwY%2F4PDNr3XZOtrn0F9d85q%2B88uxzWzjB8GgwHInB%2B2ljp8%2BO4PXve8QDMm3FcSSvv43GNcr7bDu0R9ZTOafzdKOEd4DZQEmc4jIK5XnrxW%2FvIm%2BzTM%2FLFoX%2FBw%3D%3D)
![flowchart](https://user-images.githubusercontent.com/40407778/114618667-3d60f780-9c6f-11eb-8a60-02682c4a2e1b.JPG)


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


