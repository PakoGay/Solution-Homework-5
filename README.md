# Solution-Homework-5
# Design Patterns: Proxy & Flyweight
This repository contains Java implementations of two important design patterns: Proxy and Flyweight.
1. Proxy Pattern – Real Estate Image System
Problem:

Large high-resolution property images take time to load. The website should display thumbnails instantly and only load the full image when a user requests it.

Solution:

Using the Proxy Pattern, we implement:

ImageProxy: Displays a low-resolution preview and loads the full image only when required.

HighResolutionPropertyImage: Represents the actual high-res image.

ImageUploadService: A Protection Proxy that restricts image uploads to authorized agents.

Files:

PropertyImage.java – Interface for image display.

HighResolutionPropertyImage.java – The real image class.

ImageProxy.java – The proxy that delays full image loading.

ImageUploadService.java – Restricts unauthorized uploads.

RealEstateImageApp.java – Demo client.

2. Flyweight Pattern – Map Marker System

Problem:

A map application must render thousands of markers (hospitals, restaurants, gas stations). Without optimization, each marker would store redundant style data, consuming excessive memory.

Solution:

Using the Flyweight Pattern, we implement:

MarkerStyle: Shared object containing style information.

StyledMarker: Represents a map marker with a shared style.

MarkerFactory: Ensures that styles are created only once and reused.

Files:

MapMarker.java – Interface for map markers.

MarkerStyle.java – Flyweight object storing style information.

StyledMarker.java – Concrete Flyweight class.

MarkerFactory.java – Factory that reuses existing marker styles.

MapApp.java – Demo client that creates 10,000 markers.

Results & Performance Benefits

Proxy Pattern reduces initial load time and prevents unauthorized access.

Flyweight Pattern minimizes memory usage by sharing marker styles across thousands of objects.
