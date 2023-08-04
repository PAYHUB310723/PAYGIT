:lock: **Solve maven problems**  

:one: _configure settings_  

Install Maven from Software center - (Maven 3.6.x or higher) and place this Settings.xml file in %USERPROFILE%\.m2\ 

:two: _Comment the properties below in Settings.xml_  
```xml
 <properties>
<!--                                <archetypeCatalog>https://paypalcentral.es.paypalcorp.com/nexus/content/groups/public/archetype-catalog.xml-->
<!--                                </archetypeCatalog>-->
<!--                        </properties>
```
:three: _jdk version_  
in your jdk version 1.8 202 archetype is supported but not in 1.8 232
https://mkyong.com/java/how-to-set-java_home-environment-variable-on-mac-os-x/

:four: _navigate to java folder_  
```sh
cd /Library/Java/JavaVirtualMachines
```
/Library/Java/JavaVirtualMachines/zulu-sa-1.8.0_232.jdk

:five: _open terminal_  
```sh
sudo su
nano ~/.zshenv
JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-sa-1.8.0_232.jdk

source ~/.zshenv
# exit terminal
echo $JAVA_HOME
```

:six: _export path_
JAVA_HOME=$(/usr/libexec/java_home -v1.8).
