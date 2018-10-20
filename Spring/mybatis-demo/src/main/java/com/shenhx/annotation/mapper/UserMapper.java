package com.shenhx.annotation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.shenhx.dynamicsql.model.User;

public interface UserMapper {

	/**
	 * 插入数据
	 * @param user
	 * @return 如果声明返回int类型，操作成功就是1 ,声明称void，则后续操作可以使用User的内容，否则user会给设置成空值
	 * @throws Exception
	 */
	@Insert("insert into tb_user(fusername,fpassword,fsex,fage,fphone,faddress) values(#{username},#{password},#{sex},#{age},#{phone},#{address})")
	@Options(useGeneratedKeys=true,keyProperty="id",keyColumn="fid")
	public void insertUser(User user) throws Exception;
	
	/**
	 * 更新数据举例
	 * @param user
	 * @throws Exception
	 */
	@Update("update tb_user set fpassword = #{password} where fid = #{id}")
	public void updateUser(User user) throws Exception;
	
	/**
	 * 删除
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Delete("delete from tb_user where fid = #{userId}")
	public int deleteUser(@Param("userId")Integer id) throws Exception;
	
	@Select("select * from tb_user where fid=#{id}")
	@Results({
		@Result(id=true,property="id",column="fid"),
		@Result(property="username",column="fusername"),
		@Result(property="password",column="fpassword"),
		@Result(property="sex",column="fsex"),
		@Result(property="age",column="fage"),
		@Result(property="phone",column="fphone"),
		@Result(property="address",column="faddress")
	})
	public User selectUserById(Integer id) throws Exception;
	
	@Select("select * from tb_user")
	@Results({
		@Result(id=true,property="id",column="fid"),
		@Result(property="username",column="fusername"),
		@Result(property="password",column="fpassword"),
		@Result(property="sex",column="fsex"),
		@Result(property="age",column="fage"),
		@Result(property="phone",column="fphone"),
		@Result(property="address",column="faddress")
	})
	public List<User> selectAllUser() throws Exception;
	
}
