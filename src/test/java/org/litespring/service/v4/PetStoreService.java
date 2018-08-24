package org.litespring.service.v4;

import org.litespring.beans.factory.annotation.Autowired;
import org.litespring.beans.factory.annotation.Component;
import org.litespring.dao.v4.AccountDao;
import org.litespring.dao.v4.ItemDao;

/**
 * @author yangjing
 */
@Component(value = "petStore")
public class PetStoreService {

	@Autowired
	private AccountDao accountDao;
	@Autowired
	private ItemDao itemDao;

	public AccountDao getAccountDao() {
		return accountDao;
	}
	public ItemDao getItemDao() {
		return itemDao;
	}
}
