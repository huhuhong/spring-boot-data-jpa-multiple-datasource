package com.prototype.merchant.domain.repository;

import static org.junit.Assert.assertThat;

/**
 * Created by david.hong on 24/11/2015.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
////@SpringApplicationConfiguration(classes = {RepositoryConfiguration.class})
//@ContextConfiguration(locations = {"classpath:test-domain-context.xml"})
//public class MerchantRepositoryTest {
//
//    @Autowired
//    @PersistenceContext
//    private EntityManager em;
//    private MerchantRepository merchantRepository;
//
//    @Autowired
//    public void setProductRepository(MerchantRepository merchantRepository) {
//        this.merchantRepository = merchantRepository;
//    }
//
//    @Test
//    public void TestGetMerchantList()
//    {
//        List<Merchant> merchant = this.merchantRepository.findAll();
//        Assert.assertEquals(merchant.size(),3);
//    }
//    @Test
//    public void TestCreateMerchant()
//    {
//        Merchant merchant = new Merchant();
//        merchant.setId(UUID.randomUUID());
//        merchant.setOrganizationCode("AFAU");
//        merchant.setServerName("ABC123");
//        this.em.persist(merchant);
//        this.em.flush();
//;
//    }
//
//}
