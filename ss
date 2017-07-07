[33mcommit 78e3bdf717c39601c3e722d573631ee15eb78766[m
Author: admin <sorhtfl12@gmail.com>
Date:   Fri Jul 7 10:39:05 2017 +0900

    ikhcho branch first commit

[1mdiff --git a/.classpath b/.classpath[m
[1mnew file mode 100644[m
[1mindex 0000000..194569b[m
[1m--- /dev/null[m
[1m+++ b/.classpath[m
[36m@@ -0,0 +1,31 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<classpath>[m
[32m+[m	[32m<classpathentry kind="src" output="target/classes" path="src/main/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="src" output="target/test-classes" path="src/test/java">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="optional" value="true"/>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">[m
[32m+[m		[32m<attributes>[m
[32m+[m			[32m<attribute name="maven.pomderived" value="true"/>[m
[32m+[m		[32m</attributes>[m
[32m+[m	[32m</classpathentry>[m
[32m+[m	[32m<classpathentry kind="output" path="target/classes"/>[m
[32m+[m[32m</classpath>[m
[1mdiff --git a/.project b/.project[m
[1mnew file mode 100644[m
[1mindex 0000000..5ad296c[m
[1m--- /dev/null[m
[1m+++ b/.project[m
[36m@@ -0,0 +1,29 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<projectDescription>[m
[32m+[m	[32m<name>Lecture-Spring</name>[m
[32m+[m	[32m<comment></comment>[m
[32m+[m	[32m<projects>[m
[32m+[m	[32m</projects>[m
[32m+[m	[32m<buildSpec>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.jdt.core.javabuilder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.eclipse.m2e.core.maven2Builder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m		[32m<buildCommand>[m
[32m+[m			[32m<name>org.springframework.ide.eclipse.core.springbuilder</name>[m
[32m+[m			[32m<arguments>[m
[32m+[m			[32m</arguments>[m
[32m+[m		[32m</buildCommand>[m
[32m+[m	[32m</buildSpec>[m
[32m+[m	[32m<natures>[m
[32m+[m		[32m<nature>org.springframework.ide.eclipse.core.springnature</nature>[m
[32m+[m		[32m<nature>org.eclipse.jdt.core.javanature</nature>[m
[32m+[m		[32m<nature>org.eclipse.m2e.core.maven2Nature</nature>[m
[32m+[m	[32m</natures>[m
[32m+[m[32m</projectDescription>[m
[1mdiff --git a/.settings/org.eclipse.core.resources.prefs b/.settings/org.eclipse.core.resources.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..733f390[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.core.resources.prefs[m
[36m@@ -0,0 +1,2 @@[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32mencoding//src/main/java/DI06=UTF-8[m
[1mdiff --git a/.settings/org.eclipse.jdt.core.prefs b/.settings/org.eclipse.jdt.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..09c591f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.jdt.core.prefs[m
[36m@@ -0,0 +1,13 @@[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.inlineJsrBytecode=enabled[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.methodParameters=do not generate[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.targetPlatform=1.5[m
[32m+[m[32morg.eclipse.jdt.core.compiler.codegen.unusedLocal=preserve[m
[32m+[m[32morg.eclipse.jdt.core.compiler.compliance=1.8[m
[32m+[m[32morg.eclipse.jdt.core.compiler.debug.lineNumber=generate[m
[32m+[m[32morg.eclipse.jdt.core.compiler.debug.localVariable=generate[m
[32m+[m[32morg.eclipse.jdt.core.compiler.debug.sourceFile=generate[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.assertIdentifier=error[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.enumIdentifier=error[m
[32m+[m[32morg.eclipse.jdt.core.compiler.problem.forbiddenReference=warning[m
[32m+[m[32morg.eclipse.jdt.core.compiler.source=1.5[m
[1mdiff --git a/.settings/org.eclipse.m2e.core.prefs b/.settings/org.eclipse.m2e.core.prefs[m
[1mnew file mode 100644[m
[1mindex 0000000..f897a7f[m
[1m--- /dev/null[m
[1m+++ b/.settings/org.eclipse.m2e.core.prefs[m
[36m@@ -0,0 +1,4 @@[m
[32m+[m[32mactiveProfiles=[m
[32m+[m[32meclipse.preferences.version=1[m
[32m+[m[32mresolveWorkspaceProjects=true[m
[32m+[m[32mversion=1[m
[1mdiff --git a/pom.xml b/pom.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..9c07b5e[m
[1m--- /dev/null[m
[1m+++ b/pom.xml[m
[36m@@ -0,0 +1,27 @@[m
[32m+[m[32m<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"[m
[32m+[m	[32mxsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">[m
[32m+[m	[32m<modelVersion>4.0.0</modelVersion>[m
[32m+[m	[32m<groupId>Lecture-Spring</groupId>[m
[32m+[m	[32m<artifactId>Lecture-Spring</artifactId>[m
[32m+[m	[32m<version>0.0.1-SNAPSHOT</version>[m
[32m+[m
[32m+[m	[32m<dependencies>[m
[32m+[m		[32m<dependency>[m
[32m+[m			[32m<groupId>org.springframework</groupId>[m
[32m+[m			[32m<artifactId>spring-context</artifactId>[m
[32m+[m			[32m<version>4.3.9.RELEASE</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->[m
[32m+[m		[32m<dependency>[m
[32m+[m		[32m    <groupId>org.aspectj</groupId>[m
[32m+[m		[32m    <artifactId>aspectjrt</artifactId>[m
[32m+[m		[32m    <version>1.8.10</version>[m
[32m+[m		[32m</dependency>[m
[32m+[m		[32m<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->[m
[32m+[m		[32m<dependency>[m
[32m+[m		[32m    <groupId>org.aspectj</groupId>[m
[32m+[m		[32m    <artifactId>aspectjweaver</artifactId>[m
[32m+[m		[32m    <version>1.8.10</version>[m
[32m+[m		[32m</dependency>[m[41m						[m
[32m+[m	[32m</dependencies>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/src/main/java/AOP01/AOPMain.java b/src/main/java/AOP01/AOPMain.java[m
[1mnew file mode 100644[m
[1mindex 0000000..f1b9e73[m
[1m--- /dev/null[m
[1m+++ b/src/main/java/AOP01/AOPMain.java[m
[36m@@ -0,0 +1,12 @@[m
[32m+[m[32mpackage AOP01;[m
[32m+[m
[32m+[m[32mimport org.springframework.context.ApplicationContext;[m
[32m+[m[32mimport org.springframework.context.support.GenericXmlApplicationContext;[m
[32m+[m
[32m+[m[32mpublic class AOPMain {[m
[32m+[m	[32mpublic static void main(String[] args) {[m
[32m+[m		[32mApplicationContext context = new GenericXmlApplicationContext("NewFile.xml");[m
[32m+[m		[32mPerson boy = context.getBean("boy", Person.class);[m
[32m+[m		[32mboy.runSomething();[m
[32m+[m	[32m}[m
[32m+[m[32m}[m
[1mdiff --git a/src/main/java/AOP01/Boy.java b/src/main/java/AOP01/Boy.java[m
[1mnew file mode 100644[m
[1mindex 0000000..19a3d1a[m
[1m--- /dev/null[m
[1m+++ b/src/main/java/AOP01/Boy.java[m
[36m@@ -0,0 +1,11 @@[m
[32m+[m[32mpackage AOP01;[m
[32m+[m
[32m+[m[32mpublic class Boy implements Person {[m
[32m+[m
[32m+[m	[32m@Override[m
[32m+[m	[32mpublic void runSomething() {[m