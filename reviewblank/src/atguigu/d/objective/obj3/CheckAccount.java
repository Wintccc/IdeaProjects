package atguigu.d.objective.obj3;

/**
 * @author Wint
 * @create 2022-06-22 10:45
 */
/*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
		如果（取款金额<账户余额），
		可直接取款
		如果（取款金额>账户余额），
		计算需要透支的额度
		判断可透支额overdraft是否足够支付本次透支需要，如果可以
			将账户余额修改为0，冲减可透支金额
		如果不可以
			提示用户超过可透支额的限额
 */
public class CheckAccount extends Account {
}
