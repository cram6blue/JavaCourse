FROM gradle:4.5.1-jdk8 as build-stage
WORKDIR /function
# needed for gradle?
USER root
ENV GRADLE_USER_HOME /function/.gradle

# install git
RUN apt-get -y update && apt-get -y install git




RUN mkdir /marc\
    && cd /marc \
    && git clone https://github.com/cram6blue/JavaCourse
    
 
#Set working directory
WORKDIR /marc

	
RUN cd /marc/JavaCourse \
    && java -jar HelloWorldGradlDockerized.jar
