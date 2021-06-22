Feature: US1005_Amazon Scenario Outline

  Scenario Outline: TC10_Amazon coklu Arama
    
    Given kullanici amazon sayfasina gider
    Then "<Meyve>" icin arama yapar
    And sonuclarin "<Meyve>" icerdigini test eder


    Examples:
    |Meyve|
    |elma|
    |armut|
    |kavun|
    |karpuz|
    |kiraz|
    |visne|
    |avakado|
