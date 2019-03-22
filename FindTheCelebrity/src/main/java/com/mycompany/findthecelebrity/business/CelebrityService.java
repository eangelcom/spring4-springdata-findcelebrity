package com.mycompany.findthecelebrity.business;

import java.util.Stack;

import org.springframework.stereotype.Service;

@Service
public class CelebrityService {

	/**
	 * Algorithm by Rishabh Mahrsee at
	 * https://www.geeksforgeeks.org/the-celebrity-problem/
	 * 
	 * @param matrix
	 * @return
	 */
	public int findCelebrity(int[][] matrix) {
		int n = matrix.length; 
		
		Stack<Integer> st = new Stack<>();
		int c;

		for (int i = 0; i < n; i++) {
			st.push(i);
		}

		while (st.size() > 1) {
			int a = st.pop();
			int b = st.pop();

			if (matrix[a][b] == 1) { //if knows(a, b)
				st.push(b);
			}

			else
				st.push(a);
		}

		c = st.pop();

		for (int i = 0; i < n; i++) {
			if (i != c && (matrix[c][i] == 1 || matrix[i][c] != 1))
				return -1;
		}
		
		return c;
	}

}
