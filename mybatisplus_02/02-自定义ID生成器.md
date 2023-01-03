# 实体类配置
```java
@TableId(value = "id", type = IdType.ASSIGN_ID)
private String id;
```
# ID生成器
CustomIdGenerator.java