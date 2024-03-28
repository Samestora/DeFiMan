FROM openjdk:11-jdk
WORKDIR /app

COPY target/defiman-0.1.0.jar /app/defiman-0.1.0.jar

RUN apt-get update && \
    apt-get install -y wget unzip libgtk-3-0 libgdk-pixbuf2.0-0 libfontconfig1 libx11-6 libxext6 libxrender1 libxtst6 libxt-dev&& \
    rm -rf /var/lib/apt/lists/*

# Remove the comment if you want to docker let the download (it's slow)
#RUN wget -q https://download2.gluonhq.com/openjfx/16/openjfx-16_linux-x64_bin-sdk.zip

# If you have downloaded the openjfx on your host machine instead of the docker itself
COPY req/openjfx-16_linux-x64_bin-sdk.zip /app

RUN unzip openjfx-16_linux-x64_bin-sdk.zip && \
    rm openjfx-16_linux-x64_bin-sdk.zip

CMD ["java", "--module-path", "/app/javafx-sdk-16/lib", "--add-modules", "javafx.controls,javafx.fxml", "-jar", "defiman-0.1.0.jar"]