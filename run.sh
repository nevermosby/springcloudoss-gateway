
export EUREKA_ADDRESS_LIST="http://eureka-0.eureka:28888/eureka/,http://eureka-1.eureka:28881/eureka/,http://eureka-2.eureka:28882/eureka/"

mvn clean package && java -jar ./target/gateway-0.0.1.jar
