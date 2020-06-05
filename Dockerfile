FROM websphere-liberty:kernel

COPY --chown=1001:0  ./target/debezium-war-1.0.0.war /config/dropins/
COPY --chown=1001:0  ./server.xml /config/
RUN configure.sh