package com.prototype.merchant.controller;

/**
 * Created by david.hong on 25/11/2015.
 */
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = TestApplication.class)
//@WebAppConfiguration
//@IntegrationTest({"server.port=0"})
//public class MerchantControllerTest {
//
//    @Value("${local.server.port}")
//    private int port;
//    private String baseUrl;
//
//    private URL base;
//    private RestTemplate template;
//
//    @Before
//    public void setUp() throws Exception {
//        this.baseUrl = "http://localhost:" + port + "/api/v1/merchants";
//        template = new TestRestTemplate();
//    }
//    @Test
//    public void TestGetMerchantList()  throws Exception
//    {
//        this.base = new URL(this.baseUrl);
//        ResponseEntity<Object[]> responseEntity = template.getForEntity(this.base.toURI(), Object[].class);
//        Object[] users =responseEntity.getBody();
//        MediaType contentType = responseEntity.getHeaders().getContentType();
//        HttpStatus statusCode = responseEntity.getStatusCode();
//
//        Assert.assertEquals(users.length, 3);
//    }
//
//    @Test
//    public void TestGetMerchantByCode()  throws Exception
//    {
//        this.base = new URL(this.baseUrl + "/AFNZ");
//        ResponseEntity<Object> responseEntity = template.getForEntity(this.base.toURI(), Object.class);
//        Object merchants =responseEntity.getBody();
//        MediaType contentType = responseEntity.getHeaders().getContentType();
//        HttpStatus statusCode = responseEntity.getStatusCode();
//
//        Assert.assertNotNull(merchants);
//    }
//}
