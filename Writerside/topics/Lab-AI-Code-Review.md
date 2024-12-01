# Lab: AI Code Review

## Extension

There are many extensions downloadable that can be put in the pipeline.
Like ChatGPT...

* [Extensions for Azure DevOps](https://marketplace.visualstudio.com/azuredevops)

![azure_devops_extension.png](azure_devops_extension.png)

In this section, we'll use this GPT extension.
Please install this plugin first.

* [PR Reviewer with Azure OpenAI GPT](https://marketplace.visualstudio.com/items?itemName=tw-developer.GPTPRReviewer)

![PR_Reviewer_GPT.png](PR_Reviewer_GPT.png)

## Steps

1. Create a new PR-pipeline first by following the previous chapter.

You must have completed the following configuration before executing the pipeline.

1. Get the API key
    - You need to get your own OpenAI key for using this function.
    - [OpenAI - Setting - API keys](https://platform.openai.com/settings/organization/api-keys)
2. Set security configuration
    - ![](https://hackmd.io/_uploads/Bk-9FgmnR.png)
3. Set API Key
    - ![](https://hackmd.io/_uploads/SkyROgQhR.png)
4. Check `Allow scripts to access the OAuth token` box
    - ![](https://hackmd.io/_uploads/SytNteQ3A.png)

## Result

This is the example of mine.

![](CodeReviewMessage.png)

### Console of the GPT task

```plain text
Starting: GPT PR Reviewer 
==============================================================================
Task         : Review PR by GPT
Description  : A task for PR auto review using Azure OpenAI
Version      : 0.9.70
Author       : TwDeveloper
Help         : 
==============================================================================
Changed Files (excluding binary files) : 
 gradlew
springboot/src/main/kotlin/com/enix/controller/IndexPageController.kt
Start deleting existing comments added by the previous Job ...
Existing comments deleted.
Start reviewing gradlew with openai ...
Start reviewing springboot/src/main/kotlin/com/enix/controller/IndexPageController.kt with openai ...
New comment added.
Review of gradlew completed.
New comment added.
Review of springboot/src/main/kotlin/com/enix/controller/IndexPageController.kt completed.
Finishing: GPT PR Reviewer
```