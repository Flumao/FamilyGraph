package org.flumao.urlife.util;

import java.util.ArrayList;
import java.util.List;

import org.flumao.urlife.entity.Node;
import org.flumao.urlife.entity.User;

/**
 * GraphUtil 图工具类
 * 
 * @author Flumao
 * 
 */
public class GraphUtil {
	/**
	 * 把User包装成Node
	 * @param users
	 * @return
	 */
	public static List<Node> setColorAndShape(List<User> users) {
		List<Node> nodes = new ArrayList<Node>();
		for (int i = 0; i < users.size(); i++) {
			//利用构造器给node添加color和shape
			Node node = new Node(users.get(i), i);
			nodes.add(node);
		}
		return nodes;
	}

}
