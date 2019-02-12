@REM ----------------------------------------------------------------------------
@REM Copyright 2001-2004 The Apache Software Foundation.
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM      http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM ----------------------------------------------------------------------------
@REM

@echo off

set ERROR_CODE=0

:init
@REM Decide how to startup depending on the version of windows

@REM -- Win98ME
if NOT "%OS%"=="Windows_NT" goto Win9xArg

@REM set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" @setlocal

@REM -- 4NT shell
if "%eval[2+2]" == "4" goto 4NTArgs

@REM -- Regular WinNT shell
set CMD_LINE_ARGS=%*
goto WinNTGetScriptDir

@REM The 4NT Shell from jp software
:4NTArgs
set CMD_LINE_ARGS=%$
goto WinNTGetScriptDir

:Win9xArg
@REM Slurp the command line arguments.  This loop allows for an unlimited number
@REM of arguments (up to the command line limit, anyway).
set CMD_LINE_ARGS=
:Win9xApp
if %1a==a goto Win9xGetScriptDir
set CMD_LINE_ARGS=%CMD_LINE_ARGS% %1
shift
goto Win9xApp

:Win9xGetScriptDir
set SAVEDIR=%CD%
%0\
cd %0\..\.. 
set BASEDIR=%CD%
cd %SAVEDIR%
set SAVE_DIR=
goto repoSetup

:WinNTGetScriptDir
set BASEDIR=%~dp0\..

:repoSetup


if "%JAVACMD%"=="" set JAVACMD=java

if "%REPO%"=="" set REPO=%BASEDIR%\repo

set CLASSPATH="%BASEDIR%"\etc;"%REPO%"\org\apache\logging\log4j\log4j-core\2.11.2\log4j-core-2.11.2.jar;"%REPO%"\org\apache\logging\log4j\log4j-api\2.10.0\log4j-api-2.10.0.jar;"%REPO%"\javax\json\javax.json-api\1.1.4\javax.json-api-1.1.4.jar;"%REPO%"\org\springframework\boot\spring-boot-starter-data-jpa\2.0.5.RELEASE\spring-boot-starter-data-jpa-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\boot\spring-boot-starter\2.0.5.RELEASE\spring-boot-starter-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\boot\spring-boot\2.0.5.RELEASE\spring-boot-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\boot\spring-boot-autoconfigure\2.0.5.RELEASE\spring-boot-autoconfigure-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\boot\spring-boot-starter-logging\2.0.5.RELEASE\spring-boot-starter-logging-2.0.5.RELEASE.jar;"%REPO%"\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;"%REPO%"\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;"%REPO%"\org\apache\logging\log4j\log4j-to-slf4j\2.10.0\log4j-to-slf4j-2.10.0.jar;"%REPO%"\org\slf4j\jul-to-slf4j\1.7.25\jul-to-slf4j-1.7.25.jar;"%REPO%"\javax\annotation\javax.annotation-api\1.3.2\javax.annotation-api-1.3.2.jar;"%REPO%"\org\springframework\spring-core\5.0.9.RELEASE\spring-core-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\spring-jcl\5.0.9.RELEASE\spring-jcl-5.0.9.RELEASE.jar;"%REPO%"\org\yaml\snakeyaml\1.19\snakeyaml-1.19.jar;"%REPO%"\org\springframework\boot\spring-boot-starter-aop\2.0.5.RELEASE\spring-boot-starter-aop-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\spring-aop\5.0.9.RELEASE\spring-aop-5.0.9.RELEASE.jar;"%REPO%"\org\aspectj\aspectjweaver\1.8.13\aspectjweaver-1.8.13.jar;"%REPO%"\org\springframework\boot\spring-boot-starter-jdbc\2.0.5.RELEASE\spring-boot-starter-jdbc-2.0.5.RELEASE.jar;"%REPO%"\com\zaxxer\HikariCP\2.7.9\HikariCP-2.7.9.jar;"%REPO%"\org\springframework\spring-jdbc\5.0.9.RELEASE\spring-jdbc-5.0.9.RELEASE.jar;"%REPO%"\javax\transaction\javax.transaction-api\1.2\javax.transaction-api-1.2.jar;"%REPO%"\org\hibernate\hibernate-core\5.2.17.Final\hibernate-core-5.2.17.Final.jar;"%REPO%"\org\jboss\logging\jboss-logging\3.3.2.Final\jboss-logging-3.3.2.Final.jar;"%REPO%"\org\hibernate\javax\persistence\hibernate-jpa-2.1-api\1.0.2.Final\hibernate-jpa-2.1-api-1.0.2.Final.jar;"%REPO%"\org\javassist\javassist\3.22.0-GA\javassist-3.22.0-GA.jar;"%REPO%"\antlr\antlr\2.7.7\antlr-2.7.7.jar;"%REPO%"\org\jboss\jandex\2.0.3.Final\jandex-2.0.3.Final.jar;"%REPO%"\com\fasterxml\classmate\1.3.4\classmate-1.3.4.jar;"%REPO%"\dom4j\dom4j\1.6.1\dom4j-1.6.1.jar;"%REPO%"\org\hibernate\common\hibernate-commons-annotations\5.0.1.Final\hibernate-commons-annotations-5.0.1.Final.jar;"%REPO%"\org\springframework\data\spring-data-jpa\2.0.10.RELEASE\spring-data-jpa-2.0.10.RELEASE.jar;"%REPO%"\org\springframework\data\spring-data-commons\2.0.10.RELEASE\spring-data-commons-2.0.10.RELEASE.jar;"%REPO%"\org\springframework\spring-orm\5.0.9.RELEASE\spring-orm-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\spring-context\5.0.9.RELEASE\spring-context-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\spring-expression\5.0.9.RELEASE\spring-expression-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\spring-tx\5.0.9.RELEASE\spring-tx-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\spring-beans\5.0.9.RELEASE\spring-beans-5.0.9.RELEASE.jar;"%REPO%"\org\slf4j\slf4j-api\1.7.25\slf4j-api-1.7.25.jar;"%REPO%"\org\springframework\spring-aspects\5.0.9.RELEASE\spring-aspects-5.0.9.RELEASE.jar;"%REPO%"\org\postgresql\postgresql\42.2.5\postgresql-42.2.5.jar;"%REPO%"\com\h2database\h2\1.4.197\h2-1.4.197.jar;"%REPO%"\org\glassfish\javax.json\1.1.4\javax.json-1.1.4.jar;"%REPO%"\org\json\json\20180813\json-20180813.jar;"%REPO%"\org\springframework\boot\spring-boot-starter-amqp\2.0.5.RELEASE\spring-boot-starter-amqp-2.0.5.RELEASE.jar;"%REPO%"\org\springframework\spring-messaging\5.0.9.RELEASE\spring-messaging-5.0.9.RELEASE.jar;"%REPO%"\org\springframework\amqp\spring-rabbit\2.0.6.RELEASE\spring-rabbit-2.0.6.RELEASE.jar;"%REPO%"\org\springframework\amqp\spring-amqp\2.0.6.RELEASE\spring-amqp-2.0.6.RELEASE.jar;"%REPO%"\org\springframework\retry\spring-retry\1.2.2.RELEASE\spring-retry-1.2.2.RELEASE.jar;"%REPO%"\com\rabbitmq\amqp-client\5.4.1\amqp-client-5.4.1.jar;"%REPO%"\org\springframework\spring-web\5.0.9.RELEASE\spring-web-5.0.9.RELEASE.jar;"%REPO%"\com\bat\petra\worker\0.0.1-SNAPSHOT\worker-0.0.1-SNAPSHOT.jar
set EXTRA_JVM_ARGUMENTS=
goto endInit

@REM Reaching here means variables are defined and arguments have been captured
:endInit

%JAVACMD% %JAVA_OPTS% %EXTRA_JVM_ARGUMENTS% -classpath %CLASSPATH_PREFIX%;%CLASSPATH% -Dapp.name="worker" -Dapp.repo="%REPO%" -Dbasedir="%BASEDIR%" com.bat.petra.data.WorkerApplication %CMD_LINE_ARGS%
if ERRORLEVEL 1 goto error
goto end

:error
if "%OS%"=="Windows_NT" @endlocal
set ERROR_CODE=1

:end
@REM set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" goto endNT

@REM For old DOS remove the set variables from ENV - we assume they were not set
@REM before we started - at least we don't leave any baggage around
set CMD_LINE_ARGS=
goto postExec

:endNT
@endlocal

:postExec

if "%FORCE_EXIT_ON_ERROR%" == "on" (
  if %ERROR_CODE% NEQ 0 exit %ERROR_CODE%
)

exit /B %ERROR_CODE%
