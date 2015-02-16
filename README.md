# LearningPlayWithScala
----
## What is this?
I'm trying out a few technologies to get acquainted as fast as possible for myself and for a job in the summer.

##What technologies?
* [Scala](http://www.scala-lang.org/)
* [Play Framework](https://www.playframework.com/)
* [Bootstrap](http://getbootstrap.com/)
* [Twirl](http://www.scalatra.org/2.4/guides/views/twirl.html)
* [Vim](http://www.vim.org/)

##WTF? Vim?
Watching my professor zip around in vim is insane. I'm insane, therefore I must learn..

But seriously its blazingly fast, try it.

## Usage
Open the project in IntelliJ with the Scala Plugin. 

Go to directory and type

    activator run

Assuming you have Play installed, this will run a development server on your system.

Point your browser to 

    localhost:9000

##What does it do?
The Scala written Play framework server will load a Twirl templated webpage.

The page is beautified with Bootstrap and lets you add data to the memory of the system.

After each successful data addition, the page will refresh and you can see the total data on the server on the right

To see all the data you've added in JSON format, go to:

    localhost:9000/persons

##IDE
I used IntelliJ with the [Scala](https://plugins.jetbrains.com/plugin/?id=1347) and [IdeaVim plugins](https://plugins.jetbrains.com/plugin/164)

##License
This software is licensed under the Apache 2 license, quoted below.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this project except in compliance with
the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0.

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific
language governing permissions and limitations under the License
