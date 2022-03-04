# Scala-DataEngi


**Preliminary questions**

**1) What technical/business constraints should the data storage component of theprogram architecture meet to fulfill the requirement described by the customer inparagraph «Statistics»?**

  The customer wants to store the data to make statistics later, but actually they don't know how to do. We have a good knowledge of the data we need to deal. The    weight is about 200 GO. Also, the data should be store for an indeterminate duration.
  To concluse, the data storage that we should use is a data lake.
  For the client it is a big interest financial to use this solution.

**2)What business constraint should the architecture meet to fulfill the requirementdescribe in the paragraph «Alert»? Which component to choose?**
  
  The first business constraint is financial, you will need a lot of peacewatcher to analyse all the population at the same time
  The second business constraint is a consitency problem, only one alert of a peacewatcher must be active for a citizen. You can't have more peacewatcher alerting 
  during all the process

**3)What mistake(s) from Peaceland can explain the failed attempt?**
  
  A bad model and works on the IA.

**4)Peaceland has likely forgotten some technical information in the report sent by thedrone. In the future, this information could help Peaceland make its peacewatchersmuch more efficient. Which information?**

There are no date on the collected data. And this information can be usefull for statistics
