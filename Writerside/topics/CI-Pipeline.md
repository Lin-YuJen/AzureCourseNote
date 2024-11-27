# CI &amp; Pipeline

First, we need to decide where the source code has been saved.

In Azure, we can clone the source code into the repository provided by the platform.

![Step_of_import_file.png](Step_of_import_file.png)

## Create the basic pipeline.

### Variables

There are many predefined variables we can use.

* [Use predefined variables](https://learn.microsoft.com/en-us/azure/devops/pipelines/build/variables?view=azure-devops&tabs=yaml)

| Variable                       | Description                                                                                             | Example Value       |
|--------------------------------|---------------------------------------------------------------------------------------------------------|---------------------|
| build.artifactstagingdirectory | The local path on the agent where any artifacts are copied to before being pushed to their destination. | /home/vsts/work/1/a |
| system.defaultworkingdirectory | The local path on the agent where your source code files are downloaded.                                | /home/vsts/work/1/s |

## Run the pipeline

### Sample console output of running pipeline

The following content is one of the histories of my pipeline.
I think it may help who never use the Azure DevOps platform before
to quickly understand what the default tasks of the pipeline have done for you.

#### Checkout Lin-YuJen/AzureCourseNote@master to s

> Skip, not important.

#### gradlew :springboot:build

> Skip, not important.

#### Copy Files to: $(build.artifactstagingdirectory)

The value of `build.artifactstagingdirectory` is `/home/vsts/work/1/a`

```text
Starting: Copy Files to: /home/vsts/work/1/a
==============================================================================
Task         : Copy files
Description  : Copy files from a source folder to a target folder using patterns matching file paths (not folder paths)
Version      : 2.246.0
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/copy-files
==============================================================================
found 2 files
Copying /home/vsts/work/1/s/springboot/build/libs/springboot-1.0-plain.jar to /home/vsts/work/1/a/springboot/build/libs/springboot-1.0-plain.jar
Copying /home/vsts/work/1/s/springboot/build/libs/springboot-1.0.jar to /home/vsts/work/1/a/springboot/build/libs/springboot-1.0.jar
Finishing: Copy Files to: /home/vsts/work/1/a
```

#### Publish Artifact: drop ($(build.artifactstagingdirectory))

The value of `build.artifactstagingdirectory` is `/home/vsts/work/1/a`

```text
Starting: Publish Artifact: drop (/home/vsts/work/1/a)
==============================================================================
Task         : Publish build artifacts
Description  : Publish build artifacts to Azure Pipelines or a Windows file share
Version      : 1.247.1
Author       : Microsoft Corporation
Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/publish-build-artifacts
==============================================================================
Async Command Start: Upload Artifact
Uploading 2 files
File upload succeed.
Upload '/home/vsts/work/1/a' to file container: '#/72108640/drop (/home/vsts/work/1/a)'
Associated artifact 13 with build 18
Async Command End: Upload Artifact
Finishing: Publish Artifact: drop (/home/vsts/work/1/a)
```

#### Azure App Service Deploy: SpringBoot3 in $(System.DefaultWorkingDirectory)

The value of `System.DefaultWorkingDirectory` is `/home/vsts/work/1/s`

```text
Starting: Azure App Service Deploy: SpringBoot3 in /home/vsts/work/1/s
==============================================================================
Task         : Azure App Service deploy
Description  : Deploy to Azure App Service a web, mobile, or API app using Docker, Java, .NET, .NET Core, Node.js, PHP, Python, or Ruby
Version      : 4.247.1
Author       : Microsoft Corporation
Help         : https://aka.ms/azureappservicetroubleshooting
==============================================================================
Got service connection details for Azure App Service:'Springboot3-KT'
Package deployment using ZIP Deploy initiated.
Deploy logs can be viewed at https://springboot3-kt-f6anhcdnhkgdbyhs.scm.eastasia-01.azurewebsites.net/api/deployments/d05701c9-ec2d-4a8f-87d6-8f7b0ff3e862/log
Successfully deployed web package to App Service.
Successfully updated App Service configuration details
Successfully updated deployment History at https://springboot3-kt-f6anhcdnhkgdbyhs.scm.eastasia-01.azurewebsites.net/api/deployments/181732688335436
App Service Application URL: https://springboot3-kt-f6anhcdnhkgdbyhs.eastasia-01.azurewebsites.net
Finishing: Azure App Service Deploy: SpringBoot3 in /home/vsts/work/1/s
```

#### Post-job: Checkout Lin-YuJen/AzureCourseNote@master to s

```text
Starting: Checkout Lin-YuJen/AzureCourseNote@master to s
==============================================================================
Task         : Get sources
Description  : Get sources from a repository. Supports Git, TfsVC, and SVN repositories.
Version      : 1.0.0
Author       : Microsoft
Help         : [More Information](https://go.microsoft.com/fwlink/?LinkId=798199)
==============================================================================
Cleaning any cached credential from repository: Lin-YuJen/AzureCourseNote (GitHub)
Finishing: Checkout Lin-YuJen/AzureCourseNote@master to s
```