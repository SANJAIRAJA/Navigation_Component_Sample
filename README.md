# Android Navigation Component Example

This project demonstrates how to use the Android Navigation Component to manage navigation within an Android application. It covers the setup process, basic usage, and how to handle navigation actions and arguments.

## Table of Contents

- [Introduction](#introduction)
- [Setup](#setup)
- [Usage](#usage)
  - [Adding Navigation to the Project](#adding-navigation-to-the-project)
  - [Creating Navigation Graph](#creating-navigation-graph)
  - [Setting Up Navigation Host](#setting-up-navigation-host)
  - [Navigating Between Destinations](#navigating-between-destinations)
  - [Passing Arguments Between Destinations](#passing-arguments-between-destinations)
- [License](#license)

## Introduction

The Navigation Component is a part of Android Jetpack that simplifies navigation and passing data between different destinations in an Android application. It provides a consistent way to handle navigation and helps to reduce boilerplate code.

## Setup

To use the Navigation Component in your project, follow these steps:

1. **Add the necessary dependencies** to your `build.gradle` file:

    ```groovy
    dependencies {
        implementation "androidx.navigation:navigation-fragment-ktx:2.5.3"
        implementation "androidx.navigation:navigation-ui-ktx:2.5.3"
    }
    ```

2. **Sync your project** with Gradle files.

## Usage

### Adding Navigation to the Project

1. **Create a Navigation Graph**:

   - Right-click on the `res` directory and select `New > Android Resource File`.
   - Set the `File name` to `nav_graph`, the `Resource type` to `Navigation`, and click `OK`.

2. **Define Destinations** in the Navigation Graph:

   - Open the newly created `nav_graph.xml` file.
   - Add fragments as destinations using the visual editor or directly in the XML.

### Creating Navigation Graph

In `nav_graph.xml`, define your navigation graph with the desired fragments and actions:

```xml
<?xml version="1.0" encoding="utf-8"?>
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    app:startDestination="@id/homeFragment">

    <fragment
        android:id="@+id/homeFragment"
        android:name="com.example.app.HomeFragment"
        android:label="Home"
        tools:layout="@layout/fragment_home">
        <action
            android:id="@+id/action_homeFragment_to_detailsFragment"
            app:destination="@id/detailsFragment" />
    </fragment>

    <fragment
        android:id="@+id/detailsFragment"
        android:name="com.example.app.DetailsFragment"
        android:label="Details"
        tools:layout="@layout/fragment_details" />
</navigation>
