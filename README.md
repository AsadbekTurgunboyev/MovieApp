# MovieApp

MovieApp is an open-source Android application that provides users with the latest movie information, including details, ratings, and trailers. The app is built using a clean architecture approach, following the MVVM (Model-View-ViewModel) pattern, and is powered by [The Movie Database (TMDb) API](https://www.themoviedb.org/documentation/api).

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)

## Features
- Browse popular, top-rated, and upcoming movies.
- View detailed movie information, including cast, crew, and trailers.
- Search for movies by title.
- Save favorite movies for quick access.
- Responsive UI design compatible with various screen sizes.

## Technologies Used
- **Kotlin** - Main programming language used for development.
- **Clean Architecture** - Separation of concerns into layers: Domain, Data, and Presentation.
- **MVVM (Model-View-ViewModel)** - Architectural pattern used for maintaining a separation of concerns.
- **Koin** - Dependency injection framework for providing dependencies in a clean and modular way.
- **XML** - Layouts are designed using XML for a consistent and easy-to-maintain UI.
- **Retrofit** - For making RESTful API calls to the TMDb API.
- **OkHttp** - Networking library used for HTTP requests.
- **Glide** - Image loading and caching library for displaying movie posters and images.
- **LiveData** - For data observation in UI components.
- **ViewModel** - Lifecycle-aware components to store and manage UI-related data.
- **Room** - Persistence library for managing the app’s local database.
- **Coroutines** - For asynchronous programming and managing background tasks.
- **Data Binding** - For binding UI components in layouts to data sources.

## Architecture

The application is structured using Clean Architecture, ensuring a clear separation between different parts of the app. The architecture is divided into three main layers:

1. **Domain Layer**: Contains business logic and use cases.
2. **Data Layer**: Manages data from various sources (e.g., remote APIs, local database).
3. **Presentation Layer**: Handles UI-related logic and displays data to the user.

The MVVM pattern is utilized within the Presentation Layer to maintain a clean separation of concerns between the UI (View), data management (ViewModel), and business logic (Model).

## Setup and Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/asadbekturgunboyev/MovieApp.git
    cd MovieApp
    ```

2. **Obtain an API key**:
    - Sign up at [The Movie Database (TMDb)](https://www.themoviedb.org/) to obtain an API key.

3. **Add the API key to your project**:
    - Create a `local.properties` file in the root of the project and add your API key:
      ```
      TMDB_API_KEY=your_api_key_here
      ```

4. **Build the project**:
    - Open the project in Android Studio.
    - Sync the Gradle files and build the project.

5. **Run the app**:
    - Connect your Android device or start an emulator.
    - Click on the 'Run' button in Android Studio.

## Usage

Once the app is installed, you can:
- Browse movies by different categories (e.g., popular, top-rated).
- Search for movies by title.
- View detailed information about each movie.
- Save your favorite movies for quick access later.