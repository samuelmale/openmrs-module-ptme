FROM gitpod/workspace-full

USER gitpod
# configure supported java version
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh && \
    sdk install java 8.0.402-amzn && \
    sdk default java 8.0.402-amzn"