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
|4.12.2021| Research | 4              | 2:00 PM | 4:00 PM | Completed
|4.13.2021| Planning  | 4              | 12:00 PM | 4:00 PM | Completed
|4.13.2021| Setup Packages and models | 1              | 10:00 AM  | 11:00 AM | Completed
|4.14.2021| Implement Guest Repository | 2              | 3:00 PM | 3:48 PM | Completed
|4.14.2021| Implement Host Repository | 2              | 9:00 AM | 9:43 AM | Completed
|4.14.2021| Implement Reservation Repository | 2              | 4:00 PM | 4:40PM | Completed
|4.14.2021| Test Host Repository | 2              | 9:00 AM | 9:30 PM | Completed
|4.14.2021| Test Guest Repository | 2              | 3:00 PM | 3:48 PM | Completed
|4.14.2021| Test Reservation Repository | 2              | 4:00 PM | 4:40 PM | Completed
|4.14.2021| First Progress presentation|0.25  | 10:00 AM | 10:15 AM | Completed
|4.15.2021| Implement Host Services | 2              | 10:30 PM| 11:00 PM | Completed
|4.15.2021| Implement Guest Services | 2              | 1:30 PM | 2:45 PM | Completed
|4.15.2021| Implement Reservation Services | 2              | 10:30 PM | 11:00 PM | Completed
|4.17.2021| Test Host Services | 2              | 10:00 AM | 2:00 PM | Completed
|4.17.2021| Test Guest Services | 2             | 10:00 AM | 2:00 PM | Completed
|4.17.2021| Test Reservation Services | 2              | 10:00 AM | 2:00 PM | Completed
|4.16.2021| Implement View class | 1              | 9:00 AM  | 10:00 AM | Completed
|4.16.2021| Implement Controller class | 1              | 10:00 AM | 10:00 AM  | Completed
|4.16.2021| Implement App class | 0.5              | 9:00 PM | 9:15 PM | Completed
|4.16.2021| Spring Annotations | 0.5  | 9:00 PM | 9:05 PM | Completed
|4.16.2021| Second Progress presentation|0.25  | 10:15 AM | 10:30 AM | Completed
|4.16.2021| Update Tests for 100% coverage| 0.5 | 10:00 AM | 2:00 PM | Completed
|4.16.2021| Stretch Goal #1 | 4  | 6:00 PM | 10:00 PM | Completed
|4.17.2021| Stretch Goal #2 | 4  | 6:00 PM | 10:00 PM | Completed
|4.17.2021| Bugs: find and fix #1 | 1  | 6:00 PM | 10:00 PM | Completed
|4.17.2021| Update Documentation, Javadoc, HTML page| 0.5| 10:00 AM | 2:00 PM | Completed
|4.17.2021| Final Test: attempt to break code| 0.5             | 10:00 AM | 2:00 PM | Completed

Table 1

   ______________________________________________________________________
## UML Chart
 ```diff
 + Click the link below to view UML chart in full page
 ```
[Link to full diagram](https://viewer.diagrams.net/?highlight=0000ff&edit=_blank&layers=1&nav=1&title=classDiagram.drawio#R7V1Zl5s6Ev41fWbmoTnakOCxl2wz3TeZdJa5j7St2NzGxgHcy%2F31IwHCLGLxghsn5OScBFlikb6q%2BlSqks7w1eL5XeCs5rf%2BlHtnCEyfz%2FD1GUIIMCz%2BkSUvqgSApGQWuNOkLFdw5%2F7Nk0KoStfulIdpWVIU%2Bb4Xuati4cRfLvkkKpQ5QeA%2FFav98L1poWDlzHil4G7ieNXS7%2B40mielBOJN%2BXvuzubpk00r%2FeHemTzMAn%2B9TB93hjCg8AqR5OeFo26Vfmc4d6b%2BU64IvznDV4HvR8n%2FFs9X3JN9q3rt%2B4eX797NA3337%2F%2BGP52vl%2F%2F58se38%2BRmb7dpkn1gwJfRzrf%2BH3z6hsj09vrp3c%2BvM3I%2Fefr4eG6l9350vDVX3RB%2FbPSi%2Blf20arjK6jb8SDiz7rRd%2B7VbTddKKDJ%2FQWPghdRL211no5CCspzG6f3edoMMYZmUjbPDS9EJG3qpLiaZTff9I74T9pB23QWau8sAZKV%2FK9EMQ%2FO8OUPfxndpb9DcR2unIm7nH3xV7IAiBLRJwq3JL3O8ApJUvDJD93I9ZeiyOM%2FxC%2BX82jhqVtGgf%2FAr3zPD%2BKXwABZwAbpw3Plb8jb6zeyxQ%2FX83LlyR9RXh3lZtSUh7k6nK85XLgyXLH2CyuDJj4iqvTj0l%2FyUlelRbmuj0c30YiIaEZb9pArVNWF587k4C3c6VT%2BeOmkBRPR0xlOdEN1%2BCFJf2VWQcKgbRBkWSaxARNDBS1SkTfIgGYAmQFshm3RxsIUE8L6Gk5SGc73fhhVJfDJXXhOMna50ZDiMJm73vTGefHX8uXDSBgAdXU59wP3b1Hf2UiVE2RjS2uQkDW6kzdLHxPwUDT7pIYMlopunedCxRsnjNQL%2Bp7nrEL3PgPQwglm7vLSjyJ%2FoVpJk8Wn6VX4wKPJPL2oA1G9hugNXqgIL9M0bJMhipmJGbWVcc6hCxGrii5imYaJ%2BkKUqdHnl%2FINBK4%2BiJYX4v93USDU9ZlAgEB40mOyiicG7Q9nwRsr8YXjeo01Ps1jIDXUcKZTAZOwsc7EjV4aKwgsR82PWYlPdgS8p83VRKXl1Ammn9vu98T5A18219tPCysNmtrDsqaNpIFV1vYmrnNNNiWfU4zJIl%2B0%2FeHF1G4u9DNfxkImuiwlK%2FJtV767jGIAmpfir1CEV8Awz0zx4lfiGm6uxV9ZPRCCuBTf4rixYHGBlycuBX1vTU86i6Ji9LSbsEFCe5I0CHXUSeJkxqP3sbT9U1z8qxFSoupNKnWdKr%2BR0tepZiyFnWpeJNLYqe6VkMpOFe%2BkdHZ70UxKu944k9ZODb5vpLa9fpgNXVrv0Rcg0NTSjFpd1fKY1dUrj1hdvep41dUsjVZdtfJY1b6gbqQabqobp7rq%2BlGq1B7V63HUK2Som37FEPdIZuyKhn235iM%2FHiw%2Ftkv8uDrfQsoe50GEbGZQi1hMzOAoYgD2hCcb1FlsiSrFjj%2BI2etMzF%2FLWuqHG3Tgxwci0atWEt3Mf0dFuZOitDtDvomHaiAu5nwQUAiIKYAuEN6XgwhCWs9K3yUwzxnYOqyLym8V3E%2BDxXYknKGuF%2BpIia4LBkgIW%2FnbqBeOrhcghFqBb9MT0KKGySxGGQOM2baN%2B7KFVdfjZx7y4NGJffIjwxokw8KgwLAsZneDFVbOisPjqM7h6LbQqRgJ1xmHufGFIokvK2RpOe1SLeFw180PjfwYinVVRu24i3a0D%2BO907Gm3px3qA62gkp0ZUh3CsG56g34FIY%2FQXLX6glRue72Ml8ksjtUDXk37qP7uFpCU%2FmuuprVT6qrWf6e0RX0SrKa%2BblbZ%2FEqxubwNqbqB6qM%2F6tEdEBkFZcEz5lykuV6iwJbQ%2FQANnvqLtShu36LmA67O21%2FxeHCVa%2FUtS%2BmiFUS%2FgvEdGwxJMqpaFqGbVNIbGIDzDArCBxGhgmIZRJMLRsjoInwgMxAxALQgkJDERNrNBc1crfAlgqKOjztUISmOOtaCV3PxynXMaZc2%2BMPU2AAgGyGgGViy1RDqKZgRKDTRCYGFgMAqrWQvLEE0FDT%2F4JKwX3N7aHFatjtgodhHHoqKdVFEDgvN65cT6GehE7mM5tFI8XaWcVthHyv%2BVANakh%2FusmqAY0b3q0nk%2BKS873ve9xZamc5QeAHt3mgNWGsGhpUbZ9w%2FxGNR0IjrVLYOjTSvkgR1KzVCUu59sbF36HaSYab7CSmuGgoh2AnbV2qQLz86rx4vpN6ML%2BMumdH3ZMJ8WlZQhvVwEKuSCbIyJnCL9q1uzyARvt1VAwNw35VMzUqEODL6YVMFhNX954vzcnl1AnnsaqXXSR%2Bf%2BvK58ZjIq5S6wRRdXa%2FnRUoOVbeEvOS2vIZz270P%2FU88f8%2F5f%2FFQCdX18%2B5n65fsvcSHSYbnYuJEoSqJGmKGVIFm9bxVaH5Jx64ouOlh%2BF6BysV%2ButgwruItLDxQoi70GA%2BLaToNbqMIE1BGnDPidzHfEM9uNLbfZJylvMn0qLRRHbJpZp8aNpqA9HKjTBquVHSD5UbxVPCXLVUD9S%2BMFIr4%2BlzCCWN71WuDxkriVryBhvByzp8H1nUp9nc8eDRnYyOl4ESSlTy9LHu1ADh3uKrate7A76Szm8%2FSNNWJMI%2Bb8pG87%2Bj%2BT%2FI4vLxKWRdGJ4zzXNHNaVNfCNJ7l%2BNZ0TcyZ3KVdZtmp7nGv6x9rxw59ZvXe5NuzS%2FQmcXQBM8u5xevpQj3%2FKOocaPT5qXA91qm%2BvfYb2aFtunbYq1Ar4QIlKpNYrvkcR3C%2Fae0aUe5Lcm9WDkDKfEGSBgA%2BAMWWBEK2eIITaShv21zkHi%2BI9NGhCoc0c2kYY0I2on1lDXtiNt6NK8iTcU2%2B9KHJo7oJ05dHmLCnVQjVq4gz5dbRTjvsR4EOQBgar%2FOBdbP1KIQVMIRQMUoqgmc%2BMVKITOnayjEDmgjURiXw20keQTIxJVh2c7kSik%2F%2FzCTohC%2BHlnD8ToPDgF6RuE%2FYdAF0mVYGwOcwiLS8QwZfJ27S%2F%2FIVdLvgdcGGUEbl9iCK1ldGhSW7xQvkGuuHrnumfloEh%2Frn01UudhzBkkaiFaPYt%2F4pYg%2Fu0p7Tn569IPFoJtZI3VU%2B7l217N3QfxtuDjg6QXLa99H3T6kKn7qIoAMSAyBDJgrkXud02Txoc1N%2F16eyM%2BZeI5YSj%2FnQtiJf6dCvYzW8Y9I24Jrvmj3Da04y0vwpCH4YLHq2K3wEy69FYIDY%2BB%2FCnw5YaiR%2Fi4L3NXftUq8P%2BKnyiTHyIhxLIwmvP4%2BzyhLOJwPfCX8%2BjEQjt5cGY87PwUqb5VOPsWTdSuhts8RaixizhOcatmX0OZJRXnS%2F1wJC2nzkIq1OV9uGroTr1Kr812qNfuqZoWBebmKkm7OI9F8GnuRvxu5cQL3E%2BBs6pV5FvT66oi3ipfppZDn2NSdMTJ3bKqm50iyqp6Gatd9g6vl4nOD1cayFfJI0KAwVJ%2FAbtqyph632Jmitlfh3XYSve3yCTaQKe7DEBQnElijCojSrV71vU5olXXhNSb%2B1LUIaYa7TJmBBhy21gGTJPYiJYGkCLDtJApJm4MWtmusPk4IGwbAGBsMxNYxMZMM7qIGjZEVNQ1bant7P7GuuozkNORt67HG1wDoxuqBzfULli0kGELJCJmQ0KFKi6CkVgynppRatsACUCZdQHVgCBqIxvbiGj2qkaQGNiyMLFNSEyKG0LW9gRjnUvi%2FZuL6zefGzftEcgRYy8%2FK19pnFTvphVxZyS2ubSaoWWaBiikVfYGrbpst6dAMOcLr3Wvpan0fLkCEX%2B3Onh0FUdAHhmQFtQia0t8QowNYaotoGx6X%2Fg0Ne4g6aC8dCXRiSed4vIy73NsCR4cbfQwbDSypY22oHgSsyzI1LkzykYDJuggYSYTkDVNjHVLSchgTEwDaApW3bISIAYF0CaQJffqDai6jSOqywZaxSh961LV7haal3rmOz3ldeMAtdvqVZ8z2oKdbEGmKvcjJ%2B0yBZl1HJmip5kHpHJ6sgydXCZQUzJPmj8Ez7rnD22rntuTfRQhbE%2F2URrvVZJ9EDYoMik0GcUmoWrXEbV7MqKFrU2Kt%2B%2BcCAQFyYGYIssShgqbiGzxkJokoYPl5bCqezEOmBo9FCfBfs4ZNJCV81AUc7uYZUpnWOzlwgDYdaG4A3FQqB3vRwfFK3MA1n256UQcFKwueGt0UPyagDwxB4XKrBw56vE4qtIJ7RyVma%2FJUYt80VIH5G7LQ8%2FlXpmGDW2TAIRsyzKLCepQiIDBMLMoAUyuapTA3jsV1SxPtPjo2pJ1Rpo6DJqKhaptcNJR2zKwDSizKYTUBLp1tAH56Fhd%2FnnRR6fPT1FOOr3rrHs6zoduj3r1vJvRWdcrLzpMav6AnHWsupKYi4of3RInoe%2FP453magMnIISmQeHp%2BCXqtuUc%2FRJHVnesMxJPxS9Rt943%2BiV%2BTUCemF%2FC6hCvPfolDuyXsLv6JdR61Wv4JeT%2BitQoBc0LnkiFZd%2FRQUGgZRsUZQ6K0va1yIYGJso%2FcWTvhFVdKGvzTnTLAx456zA4Kwa2gayNj6KEPgiQDCzfOCkGHkikVEN7%2FnEu43gbV4UuV7mzw6LpsRWHQ1PlituhrvLofDj8tvaHWSUcjvMBgeoqjMedYGkEDedynlaezmGyCyHBpjwSKPtTyTUE0gNAxURK0FkI7KpLlxDbMHN%2FtEdmGjZhkg9IC4BNtUjWw8BXvU4Xq9Voqw9sqw8EPmAV1w%2FO7dppVBVUvR1oiUDdXD5OvR63od97L4rDeX%2BqsKCgL1io9dr8jFnM15TyEB0292f%2B0vHebEovJ%2BvgMZPDjVTCslRuWt%2F4SXavKPyLR9FLql6cdeQXrU7N5LgwNcaI5CbLsjfjpGDtRvGHm7ZvpzBaJ9KZQLZOpNVxja3z6M5z5j0hA08PMgTLONbcH%2Fob4Qd1PbFgT6eLDOg0i7aPwdIBGj17QhCkpwfOoqvPxPT0wNjZKah2jBiMMrMGhhd1wIrBlGf3z9xPNSesiIsyVjbA29jKP%2FOg3Oa4lcECTzmSBqQEaVkJYsjEbHPzx%2BymErc%2BakVlZ5TOw6hzaDN15Iu%2Bfj9HrSCVAzAUeevhaCRjP8HtSUL6xj2koOiTRhbpBefQLG10gZqPFKq8WKlBT0BHQ5tYZfBEo2E5oGHpgdHsJBasaHRI%2BgG1B20hdbalvkFfUqHbiqMkJq%2BywxouRf2eM82GORbWHA4PAekrwCEjLb%2F9%2Fmob4LS714oDZuRn%2FVA7fLRAz3pbv0FVD%2BzXD5XhPK0Fm70HK8sjoYUVG7VPr%2BISSGaKMkKYbVk2yEKKhrpig6tB%2BFeiTwPf8%2BRmouPCTf9BFjuA0CzNoKjOQ48FzDS7kgoE9wamuqPi5rkzKrPAyuz0iFIswix%2FOtUmB6KuelA9j6IcwVB3TsW4YtQNoJmS2GvFqAaPlPQGx7rd1IL1si0eWFS5WK3knKWtppx5tNV5dPlTW52F88BbnzVtf9bEWU54Nd55hP6RoK%2BcVR2gD1Fvqlgx%2FYFP6rN5vHZS3%2Becu9kUt68jqFCJdn%2Bu2hVwKAsJ5DQWEpqhsWto%2Bi8CKTosSOHq7P%2BbMHnj%2FGGg8weZAkBKyeNbBPn0eDoYrgv%2BGg8l74ffHGabwmMfC6Y9%2F0Iblj8eSj4eSj6Kb07PD%2BFcMaQ5juVW9M4tX64%2FrqTLJhy5w0C5A1Rn2amMLqvuvIajEgfNcTCJwiniKtE5b5brxahzdtQ5pG4pc%2BCUoW7rQjHX%2BibLcjZJHqE2k%2BsfZdc0j255GDozXe5%2Fqa4bvo8HM1fz3vc97uyd%2BjQi79SsXXVLNtlFAgwfPo52bqB2jrBi1GG2ScUr27m6XdPCibNcykXxWCelF6Om2VHTHGZDsKPbuLoF2JUwUZHXvurFneln%2FnPtBnyamLV2OyfbXLqzaz5xF05%2B9rkpHGF4NBgOxOD9srHT29qbDl7%2Frkc8ZE6voXj9TTSsUd5l26Edsp7yOZ0nEyW8BcyOlcQpLgNfHrue%2FfYucFbz%2BLxsUfh%2F)

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
 ```diff
 + Click the link below to view flow chart in full page
 ```
[Link to full diagram](https://viewer.diagrams.net/?highlight=0000ff&edit=_blank&layers=1&nav=1&title=flowChart.drawio#R7V1bk5u4Ev41U%2BdSNS4kcX2csT1JTu0kqU12szlvjK0Zs4PBC3gu%2B%2BtXwsiAJGNsA5axU6nEFkhgdX%2FdrVZ36woN528fIncxuw%2Bn2L%2BC2vTtCo2uINQ1Cw1sRD7RxvdVI4AWHABr1fgUedNVs5Y3fPP%2Bxtm9rHXpTXFcujEJQz%2FxFlkjWDVOwiDAk6TU5kZR%2BFq%2B7TH0p6WGhfuEhYZvE9cXW39402S2arUNLW%2F%2FiL2nGXsy0LIrD%2B7k%2BSkKl0H2vCuINBMMob66PHfZWNn98cydhq%2BFJjS%2BQsMoDJPVp%2FnbEPt0isvTdrfh6vq9IxwkdTq8aIvl7U348xX95T6CL0%2FTuaVfZ6O8uP4Ss59h%2BmS82xm5ZD7RT6wlXrgBaxuFwb8S0vFHhCfP5P%2F7d%2FLPx3AZY3Y3eZFih0KzOPKmZ2lx8p7RyfxrSSfq9jEMkus45aIbcgOAizfyX9pTS6%2B9ZsSiV4Mwmrt%2B3pk95YG%2B7XDmPZO31b48k27ultd%2BiGr9kKn3wpo0fQDgAGqUUOseheuSLpUPq%2B565xPWIiCZuRElC0GU9xSkU0LG0kb4hcKt5lg3cYzjeE7ZihBWM1Zzee%2FGCY7oxH2NQgrEDn7V95kXUx6Pwj%2FTJ1IhkLheQBuTGV7BnfxyL3gin%2F90X9wUEZNnAtq49lOu6QyFczLuTl1SibjjU9zEvZlMyOzu1O23GFMqfgoS%2FOhOKMLc%2BYJcCx7iRcV0whKAYILfUqwlc580AAqyJAqf8TD0CZOgURAGmALM832uiQBiQqcYjYz82%2FeQPHt0nWLvdeYl%2BNuCvhsavRJ1QdrCFxw9%2BqnAm3nTKQ5IWyotMZVHtFf8jJPJLPtCscseSyTp3fjuZqytf0ZRyjGRhSPyiwpNmdT7gMM5TlJGza5e23rWJ1NTbIjXXN4jaKzaZgVZr6NMlbmZjnlaj53LWfIhE7W7iF0okAdPiVrKvoZRMgufwsD1x3nr7WQZvawnL59KwE9l3vuXMCUSveNPnCTvmfZ1l0lY5gQyudH7H7T%2FwGBff2bDpV9Gb6Vv74yEJQ4idBuNboAxrqCn7z5g%2F3atOgu3QBuZwK4ieRwuowmumNZsVhM3esJZ1%2B949n4%2F%2BeXnl%2FEPNxn9kdyF89%2BvM7OFTnklA0XYdxPvpWwpyJgh6%2Fo19FKhyRgPMjoz%2Bwg55TFWb5p143hq%2FR77sxkUtPu3JFUQPO%2F5PjG38AYkF%2FikAsAVrFCQKKT9dmgOodEy5IkhWpp5xxAgD5hhVoS8rbWFeHSuiI8py91QSz3XKE1JgfvH4Ye3z%2F%2FHf%2F9hBv7Nr%2BP4y9OjTApISeI0LQUOYhCzhiVeMASizBKoZYsOfZfadLWNjv9S8zgM4tDHn74MVnbVDl3viSl1j4Pll0XihcHu%2FX%2F38OvuvcgLE970fRzt3vcDDnDkJvhX%2FNcSx53Ytmsi7kaWzxRAzb%2FexVbMTEPD3mYqQkuiN4ADW5ILVg25IKxeDpcGiyLT%2FYqJ4HlxKZq%2FkQ%2FeBPMQW2zrvyDipNxLypRbx1n6Sf1n7%2FkomXytfjEOlYe%2F0QWPzN3m6GUT2hINOUcCSOSglgBp1wGksNDf3YG0j9LOnzt%2Bm%2BA91W8B7XeeT3TiIoy9JIzedxvqAN3YvVot%2FOZUWHX8g8fBcl7%2FhVlT0VEpkUK1%2FZgXS0BmCWhsycYkjy2aAgCIkme9s9H8GlJXdQ15VVxB5gvK0%2FAaOTXXi4yuiiwYHUEPTfIVULQMBF4p42iLp0dp304ZmMiW2AQy547ZGjANVYF50u5cBrjtyARKIZO9dwGai2jlGf5EETpdTqihIdHJBlHz8cJ33z9id4qjK2PUVxSvF8zKgBippl3fvKSAYfLtZ%2BFKjmD6hQG4L8AHdYFvqgV8MZziawb8OQ6WF8AXAG9oRwf82W7JtApeZNQFr6UUeJFoUL9TL4KERX6h81cmnuvTgBs0mmDqgCANFBnexPVvsgtzspxNOSjCsfe3%2B5COR4mxoLu%2F6Y8xbin%2BGyZbJesL8F3H2WUveFWMVZPBWhsgYGczt%2B92ObslfHyMcSsb4UxPlCyycL6gT1%2BFSOGXNN5JIqAJEzP%2Fda%2FFczlGxkQ1d8xbE89QMXtMMTHLpOdWMQsbj3Y5iKy6uDjqrZhlLHy4mL3WBrbGzEt15SxUzBFyqpgFasWm6OK6Jgh7ClmjQcvIQGVP5bXyAAZiuMHEpUH9LOuhaPnMwvnDMt5u9ZxK1OB6O4ft%2BGimLhhBtsQGaiJqUBqoaplqydMWdnx2JHPn0YQmFGW29EbUUVQxsssREVCDZnmMDVHFZNbc98JtmXhtQ4qIMRKZFBFt%2Bh5KEa0sRRzbGOha%2Fgd1JlPkGk5ZmXLSbi9msm1fj6m1jazD87HtmBeoAdvONJ1mbbt3aYcWLT1J%2FMBKRgOB%2Bj2U0ZylhzTnyFLZukjlNjLC6oYQsBFVkcrMQX8GUpktOZuQyjaEh4nh9gWvI66kFUF6Y2s6VZAuXaexKMq212m6YZV1jKHb5TGay%2F6UOw9Ey663nnYGqkY87ZZjOiXS6arLFChuqmTGHDwHYw5yQJOElnRrzNmqivjTNuZqh4XZahlzbBvwDIw55vlrwJizNM0sAVsl006qcQ3FQhbO0V1vijJCSivFFnxrtSdocDFKsYcanHPHWJY5MJGT%2FzmyPhctaRp2LRBm%2F2S5%2BlJeRvIj5eZa3AJH08UUOV1CJ9ganUSvCZnNuRe4CRYlc%2F%2BK3nAuaajZpkCQbsveQNHLTKt7XJUybmk5t4dVAcH43EHFtptzx7RYgQKYkmJlrYEKiWvL8dRLDaoyGc%2BcckArOw2AZYKBJIAEMIdnN9QT7Yp7N617eaFekXpWue4L0Fm6SpFyhizduzXKiUbH0A0maRXeC%2B2KtLM52jmWMZDgDnWKO8X283Z35azzD6%2Fy7MM8F1Gef9hJYlHbjnshFYKp273jq%2BTPMcrWmm1x9Zurb2dvlTPp6vmN%2BpWRGMjVV88Vamwb8lobmJpZdl2xkqNK%2BK4q0VUgdcTSnugPzmoOr2pb0xZrSP8WLmXlZDRR8vXOYQG4GEwbSBZaLKG8VCeOGYnNK5xLWF8rYX0Sf%2BJRtRM0ytrJNrhd5dVPErTT1oHyaPeOqhNbYqCZIhx7dcqBEDIPuPxGtZKMTDFHNyuewGuTEtVPNuPW5KrSA8QWI0dLubUVW7TkJVB0HRaXIZWLkDWOQds4po%2F9iiOPzD41cNtfAgHmYd8KbrujKKfcKbJmY8ANskEhNaZGoFpMuwcb7al42lUjtcvi6Y1HW2xiNSFq2%2BAGadliMcXdjEcvmN7Qnv1UUmCd%2BHkULRWPf0A0%2B%2F6%2FT58fHRONf3sc66%2FXiuG9sNCxdlrpbI6Z2JUBWhUETJNsD6xVK7HJFqOuslpbd2G0OiBqI2a1U8asicqQNey6pVzg4aSQc4ay8ZC7KdzmENtmXJRUaNZdFAJDLRQDiV%2FSnU57q281q%2Bw4Jub1sevkrQ28Agnuem72OIKpKTkJpDUyyIWoo6gQ3XGZfSJmz1oQbo0kNdrx%2FO66nQg1kzPVDaN6R1HoYRiQY9MW9hTXE3smEt3h44IMyUkCrYmSqvMPi7u6WUweO%2FlCrIS4uqN8IIjsVIl%2B2tTXyChDBUp2%2FKAlictrjYiiXSSeQ3OfHgulXRm3N4tFWr2y3tkzm04YIaPwZ6Lsd8rI5aiyBlgSlDehoVhYRnpWmdXAFrSUI%2BucjJSf0reBFy%2Fkza5yUW1IFmKQ6evyqcUNrOKl5BWdnyJ5V8HdF8JWuWeYlqgirOw4av7w4MYIy9Y6yq0sWt%2BI79wNg8Q1ReVmeOt7Ko42KKRZOfyqV3cGhcplGhcIWTfURDd0YdzySM1t3MizAhVbO6u3Bq7MkdyeTHm0GtOV711QVasq7nnAPG9tkuufEjyvWL%2Bc9CrU1LnD7My6qWGtrV%2FYboMqmGTBJuxznXj34ydYt4t%2FibqS0%2FJoydSV713A%2F9x9xlUZM73BOX9crm0OWBLm0XbsFbMvT0T7GpKDdBTbeK98b3HjnWrY%2Fm67w7Kft9MDruRS%2BVKOpEttada1lk21rGVTtJaXi6msZEJPlCTQbK5yhWVbnWpJOR2UzeDpJ1xrG7eN7%2B8exiaicUs%2Ber0GrA7KPlMKWBGtLEO2k3AMqJhLaVM4hnV68RiVKNwO13bC0XcOx4CAK0tgZ5FcG8Mx%2BB661WyKd%2BW8no%2F2tyXaXyJMJNm77QkTZQNkB%2FDEY9orZcSpLa1NcYs9W1p%2FS9xkeTZra52FuB%2FNWLcUQ%2BwJl%2BxEdQ1x62gHRle%2BTqlixjx86a%2FmXFcIWFdacmR1L5wONSdSDIf9iYqW87wkK1RpKxyxMmr8aXkbrXC%2Bh25qHJe2YIWzeT0fWWLzFfekssSU1GxrTafbspBaXrgEU043Tt14tqZHYe5p%2B1c3SXAUpC20kjMjwo%2FsJ8K99PMmMh6C%2FK04LVDFkBharO3AeCRbL3MF4RNUHqNuzJEwEiyP0%2FLhK7ZYzeTCS93yEuA5ydyPk7hxumUj0ca8sFHHbGRpjXGSMFRbzCR3Zkh4ScgYCafYj%2BvmiQx9N45xXDvLAwzI84dugp%2FS7CHt3%2BPPv93%2Fp3Z3SLuvsvf5NJTqjijvGO3WU6c9adzCbt0umTC89dlmJozNZeuakpxpJAup11nVz%2BY9ugLWVgl0NALNI9O4Ib%2BumB7TT1feNeIKRkGJ3d9aJp3ch1BDxyrhU2i9lKZoSrTqTZA4%2FqrA1HYyxDUEcGAAC%2BoAWQ4CGuQS7CyjlCzB5TDUtQLIY8rB2MjmpFDbdoB4pJAa%2FH3yPrPKPaTttVeOFkVd%2Bd7FU49oJe%2FvIdVSXrCsck4dT0dFYbIK8UYjpyGdhWDZl2BoYgb%2FOo2vE5XFYvaUgfAeyROnAt%2Fa9c%2BOFidW%2Bd7iXvFH7E4rDcyT9iwjh3Msd1pBSU4K1erqHr3%2BWbuIlYSKVRcXUwWy4gYEn7fYT8yawlnpR8es5PilPpyevok0O59yQpZHA8cs5IZzoQE2NAfmZtpsWBoJJzmVR2jk%2BJPKIJQzhF6dfdhuoXdRl12qS1Q3spoFKSiiLSWVQfufCMHtRsrRqrcUNSEnQ52d7lOEb3OU79itygITt65YOztRb32KOR%2BFtfupRZql80Ohgb65Rk3blWVEM%2FFMVtmQF0R1q4y35hM7nX2c%2Fgki%2Bfq6bpoFQ1Hr5a5sZ%2BDYNkQGdHQALO6URiJLjEHarluaQe7jDkSrK6R4mzodt7hxdOiBoo1LMVGHn4kUq5MK1q0UqxPxdZFiHUoxWRW0ShR1UrRPz6UYx8M2MAdGLuT2PB5SqBhmgX1kWGMSSsx864M7rloENHEUsQ1AJkCUOHu4qirm2Wkfm6sMf%2FyztcQ9w94rHzWUDDvdo6hkqrDSjY5Zm8KWzWmDtDJsQctwjvr6WoavOGtwrN2cXpFOp%2BhD7INaqcR2E1rF0tkS59CYO65He0pGXOL031sMyutb%2BdEjbZXNkVKhr6ub5vZ6ulY8su2fKgC17ixGXLEHYOh7rmGAo9kDMWB347h76xryNQrDpHg7kROzNJmGNP4D)

![flowchart](https://user-images.githubusercontent.com/40407778/114618667-3d60f780-9c6f-11eb-8a60-02682c4a2e1b.JPG)


Figure 3
 ______________________________________________________________________
## Sequence Diagram

 ```diff
 + Click the link below to view flow chart in full page
 ```
![NewSequenceDiagram](https://user-images.githubusercontent.com/40407778/115240083-05313d00-a0e5-11eb-8b19-24dc13dd8c3b.png)
 ________________________________________________________
### Notes
 Project will have an additional HTML page with additional explanation on methods and classes
[link](https://github.com/see-k/dontWreckMyHouse)

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


