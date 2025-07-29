package com.app.stretegy_dp.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.app.stretegy_dp.encrypt.Encryption;
import com.app.stretegy_dp.enums.EncodingPatternEnum;

public class EncryptionFactory {
	Map<EncodingPatternEnum,Encryption> map;
	
	public EncryptionFactory(Set<Encryption> encryptionSet)
	{
		createStratergyDP(encryptionSet);
	}

	private void createStratergyDP(Set<Encryption> encryptionSet) {
		map=new HashMap<>();
		encryptionSet.stream().forEach(encryptionType->map.put(encryptionType.getEncyptionType(), encryptionType));
		
	}
	
	public Encryption findEncryptionType(EncodingPatternEnum encodingPatternEnum)
	{
		return map.get(encodingPatternEnum);
	}
	

}
