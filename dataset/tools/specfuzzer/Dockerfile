FROM ubuntu:18.04

RUN apt-get update

# Install requirements
RUN apt-get install -y openjdk-8-jdk
RUN apt-get -y install ant
RUN apt-get -y install wget
RUN apt-get -y install python3.7
RUN apt-get -y install python3-pip
RUN apt-get -y install make
RUN apt-get -y install unzip

Run mkdir /tools

# Move files to the image
Copy setup.sh .
Copy specfuzzer.tar.gz .
Copy major-1.3.4_jre7.zip .
Copy GAssert.zip /tools/
Copy daikon-5.8.2.zip /tools/ 

# Uncompress and setup
RUN tar -xvf specfuzzer.tar.gz
ENV SPECFUZZER=/specfuzzer
RUN unzip major-1.3.4_jre7.zip
ENV GASSERTDIR=/tools/GAssert
ENV DAIKONDIR=/tools/daikon-5.8.2
WORKDIR /tools
RUN unzip daikon-5.8.2.zip
WORKDIR /tools/daikon-5.8.2/java
RUN make dcomp_rt.jar
ENV EVOSPEX=/tools/evospex
ENV EVOSPEXOG=/tools/object-generation

# Install required python package
RUN pip3 install cython
RUN pip3 install numpy
RUN pip3 install pandas
WORKDIR /

