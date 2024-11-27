# Agile

There are 12 principles of Agile.
You can find the full list on the following website.

* [The 12 Principles behind the Agile Manifesto](https://www.agilealliance.org/agile101/12-principles-behind-the-agile-manifesto/)

![Agile_12_Principles.png](Agile_12_Principles.png)

1. 我們的首要任務是通過**盡早並持續交付**有價值軟體，來滿足客戶的需求。
2. 我們**歡迎**需求**變更**，甚至是開發後期。敏捷利用變化來實踐客戶的競爭優勢。
3. **頻繁的交付**成果，從數周到數個月，時間間隔愈短愈好。
4. 業務人員和開發人員必須在專案中天天**一起工作**。
5. 以**積極的個人** (**motivated individuals**) 建立專案，為他們提供所需的環境和支援，並相信他們能夠完成工作。
6. **面對面的溝通**是傳遞資訊最有效的方法。
7. **可用的軟體**是衡量進度的主要標準。
8. 敏捷程序提倡可**持續的開發**。贊助者、開發者、及使用者應當能不斷地維持穩定的步調。
9. **持續追求卓越**的技術與設計，以強化敏捷性。
10. 簡單性 — 最大化未完成工作量的藝術 — 至關重要。(**減少浪費**)
11. 最好的架構、需求和設計，都來自於**自我組織**的團隊。
12. 團隊定期自省如何更有效率，並據之適當地調整或修正自己的行為。(**持續改善**)

## Implementing Agile

> **Deliver working software frequently**, from a couple of weeks to a couple of months, with a preference to the
> shorter timescale.

To make our delivery more frequently, let's think about our branch strategy we usually use.

![](https://camo.githubusercontent.com/aaf2db7f0930e69e7949c815b89844b781690d36f1c2d09173a2660b1bb604ba/68747470733a2f2f74686570726163746963616c6465762e73332e616d617a6f6e6177732e636f6d2f692f676b33796b307532346b3538343966706c7979322e706e67)

Consider these two aspects:

### Number of the branch

1. Less of the branches, less of the works when we merge the branch.
    - Confliction.

### Life cycle of the branch

1. The Long life cycle of the branch means that 
    - There may be many code changing haven't been merged.

### Extreme case

> There is no other branch excepting the `main` branch.

### Trunk-Based Development

* [團隊的 GIT 分支管理策略 (3) ： 持續整合以及相關比較](https://medium.com/%E5%93%88%E5%98%8D-%E4%B8%96%E7%95%8C/%E5%9C%98%E9%9A%8A%E7%9A%84-git-%E5%88%86%E6%94%AF%E7%AE%A1%E7%90%86%E7%AD%96%E7%95%A5-3-%E6%8C%81%E7%BA%8C%E6%95%B4%E5%90%88%E4%BB%A5%E5%8F%8A%E7%9B%B8%E9%97%9C%E6%AF%94%E8%BC%83-59b80a29c997)
* [淺談開發流程 — Git Flow 到 Trunk-Based Development 的團隊經驗雜談](https://medium.com/@shanpigliao/%E6%B7%BA%E8%AB%87%E9%96%8B%E7%99%BC%E6%B5%81%E7%A8%8B-git-flow-%E5%88%B0-trunk-based-development-%E7%9A%84%E5%9C%98%E9%9A%8A%E7%B6%93%E9%A9%97%E9%9B%9C%E8%AB%87-a956a379987)
* [技術文章筆記：Feature Toggles (aka Feature Flag)](https://alfredkai.medium.com/%E6%8A%80%E8%A1%93%E6%96%87%E7%AB%A0%E7%AD%86%E8%A8%98-feature-toggles-aka-feature-flag-d52c7f5bc78e)