
# 测试url

- http://127.0.0.1:22222/hello

- http://127.0.0.1:22222/actuator

- http://127.0.0.1:22222/actuator/health



# 生成镜像到本地

mvn clean package dockerfile:build -Dmaven.test.skip=true

# 查看镜像

docker images

    
# 运行镜像
docker run -d -p 22222:22222 --name docker-demo docker-demo

# 删除镜像
docker rmi 


## 常用命令

``` shell script

# 启动docker
systemctl start docker
systemctl status docker
# 守护进程重启   
sudo systemctl daemon-reload

# 重启docker服务   
systemctl restart  docker

# 重启docker服务  
sudo service docker restart

## 查看正在运行的docker
docker ps -a

```
