# 1. 选择基础镜像，这里使用官方 openjdk:8-jdk-alpine（体积相对小）
FROM openjdk:8-jdk-alpine


# 4. 创建并切换到工作目录
WORKDIR /app

# 5. 将当前目录下的所有文件复制到容器的 /app 目录（视情况而定）
# 如果仅需复制 jar 包，可以使用类似 COPY target/yourapp.jar /app/ 这样更精准
COPY ./build/libs/fortest-0.0.1-SNAPSHOT.jar /app/app.jar

# 6. 暴露端口（如果你的应用对外提供服务，比如 8080）
EXPOSE 8080

# 7. 设定容器启动时默认执行的命令
# 如果你的应用是一个可执行 jar，可以用以下方式启动
CMD ["java", "-jar", "app.jar"]
