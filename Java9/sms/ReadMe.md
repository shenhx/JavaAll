# Java9许学习入门
## Java9新特性
1. 模块系统
## 环境安装

## 入门
1. Jigsaw
2. 模块系统必要性
- 可定制的JRE，更小的运行时镜像
- 更确定的模块依赖关系
3. 模块的定义
- moduel-info文件
4. 模块依赖和包导出
- 导出包：exports
- 模块的依赖关系：requires
- 受限导出：exports to
- 模块的传递依赖
> requires transitive
- provides with : 暴露接口方法
- uses : 使用接口方法
5. 打包
- Assembly
6. 创建运行时的镜像
- jlink
7. 备注说明
- 目前代码demo参考慕课网上面的视频进行整理，并没有调试运行，后续优化