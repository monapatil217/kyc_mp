package com.tes.services.impl.environmentalofficer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.tes.model.ConsentExtendedDate;
import com.tes.repository.environmentalofficer.ConsentExtendedDateRepository;
import com.tes.services.environmentalofficer.ConsentExtendedDateServices;

@Service
public class ConsentExtendedDateServicesImpl implements ConsentExtendedDateServices
{

	@Autowired
	ConsentExtendedDateRepository consentExtendedDateRepository;

	@Override
	public List findByConsValidUpto(Pageable pageable)
	{
		return consentExtendedDateRepository.findByConsValidUpto(pageable);
	}

	@Override
	public List<String> findByConsExtendedById(Integer consId)
	{
		return consentExtendedDateRepository.findByConsExtendedById(consId);
	}

	@Override
	public ConsentExtendedDate save(ConsentExtendedDate consentExtendedDate)
	{
		return consentExtendedDateRepository.save(consentExtendedDate);
	}

	// changes by pallavi
	// @Override
	// public Integer findByConsById(int consentId) {
	// // TODO Auto-generated method stub
	// return consentExtendedDateRepository.findByConsById(consentId);
	// }
	// mmm
	// @Override
	// public int updatDateByID(int consentId, String expandedInputDate, String expandedValidUpto)
	// {
	// return consentExtendedDateRepository.updatDateByID(consentId, expandedInputDate, expandedValidUpto);
	//
	// }
	@Override
	public int updatDateByID(int consentId, String upInputDate, String upValidUpto)
	{
		return consentExtendedDateRepository.updatDateByID(consentId, upInputDate, upValidUpto);

	}

	@Override
	public List<ConsentExtendedDate> checkConsetID(int consentId)
	{
		// TODO Auto-generated method stub
		return consentExtendedDateRepository.checkConsetID(consentId);
	}

	// @Override
	// public Integer updateExeDate(int consentId) {
	// return consentExtendedDateRepository.updateExeDate(consentId);
	//
	// }

}
