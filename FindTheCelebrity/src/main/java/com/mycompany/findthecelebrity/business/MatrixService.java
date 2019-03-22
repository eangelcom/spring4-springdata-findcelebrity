package com.mycompany.findthecelebrity.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.findthecelebrity.dao.MatrixRepository;
import com.mycompany.findthecelebrity.model.Matrix;
import com.mycompany.findthecelebrity.model.Party;

@Service
public class MatrixService {
	
	@Autowired
	private PartyService partyService;
	
	@Autowired
	private CelebrityService celebrityService;
	
	@Autowired
	private MatrixRepository matrixRepository;
	
	public Party insert(int[][] matrix) {
		Party party = new Party(matrix.length);
		party = partyService.insert(party);
		
		for (int[] rows : matrix) {
			for (int cell : rows) {
				matrixRepository.save(new Matrix(cell!=0, party));
			}
		}
		
		return party;
	}	
	
	public int solveCelebrityProblem(Party party) {
		int[][] matrix = findMatrixByParty(party);
					
		return celebrityService.findCelebrity(matrix);
	}

	private int[][] findMatrixByParty(Party party) {
		List<Matrix> matrixList = matrixRepository.findByPartyId(party.getId());
		
		int[][] matrix = new int[party.getMatrixSize()][party.getMatrixSize()];	
		int index = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = (matrixList.get(index).getKnown()? 1 : 0);
				index++;
			}
		}
		
		return matrix;
	}
	
}
