# CI &amp; Pipeline

First, we need to decide where the source code has been saved.

In Azure, we can clone the source code into the repository provided by the platform.

![Step_of_import_file.png](Step_of_import_file.png)

But it's no matter. We can use GitHub for this purpose as well.

## Create the basic pipeline.

### Variables

There are many predefined variables we can use.

* [Use predefined variables](https://learn.microsoft.com/en-us/azure/devops/pipelines/build/variables?view=azure-devops&tabs=yaml)

| Variable                       | Description | Example Value       |
|--------------------------------|-------------|---------------------|
| build.artifactstagingdirectory |             | /home/vsts/work/1/a |
| system.defaultworkingdirectory |             |                     |