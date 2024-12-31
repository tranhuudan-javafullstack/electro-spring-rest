package com.electro.controller;

import com.electro.constant.ResourceName;
import com.electro.constant.SearchFields;
import com.electro.model.request.address.AddressRequest;
import com.electro.model.reponse.address.AddressResponse;
import com.electro.model.request.address.DistrictRequest;
import com.electro.model.reponse.address.DistrictResponse;
import com.electro.model.request.address.ProvinceRequest;
import com.electro.model.reponse.address.ProvinceResponse;
import com.electro.model.request.address.WardRequest;
import com.electro.model.reponse.address.WardResponse;
import com.electro.model.request.authentication.RoleRequest;
import com.electro.model.reponse.authentication.RoleResponse;
import com.electro.model.request.authentication.UserRequest;
import com.electro.model.reponse.authentication.UserResponse;
import com.electro.model.request.cashbook.PaymentMethodRequest;
import com.electro.model.reponse.cashbook.PaymentMethodResponse;
import com.electro.model.request.chat.RoomRequest;
import com.electro.model.reponse.chat.RoomResponse;
import com.electro.model.request.customer.CustomerGroupRequest;
import com.electro.model.reponse.customer.CustomerGroupResponse;
import com.electro.model.request.customer.CustomerRequest;
import com.electro.model.request.customer.CustomerResourceRequest;
import com.electro.model.reponse.customer.CustomerResourceResponse;
import com.electro.model.reponse.customer.CustomerResponse;
import com.electro.model.request.customer.CustomerStatusRequest;
import com.electro.model.reponse.customer.CustomerStatusResponse;
import com.electro.model.request.employee.DepartmentRequest;
import com.electro.model.reponse.employee.DepartmentResponse;
import com.electro.model.request.employee.EmployeeRequest;
import com.electro.model.reponse.employee.EmployeeResponse;
import com.electro.model.request.employee.JobLevelRequest;
import com.electro.model.reponse.employee.JobLevelResponse;
import com.electro.model.request.employee.JobTitleRequest;
import com.electro.model.reponse.employee.JobTitleResponse;
import com.electro.model.request.employee.JobTypeRequest;
import com.electro.model.reponse.employee.JobTypeResponse;
import com.electro.model.request.employee.OfficeRequest;
import com.electro.model.reponse.employee.OfficeResponse;
import com.electro.model.request.general.ImageRequest;
import com.electro.model.reponse.general.ImageResponse;
import com.electro.model.request.inventory.CountRequest;
import com.electro.model.reponse.inventory.CountResponse;
import com.electro.model.request.inventory.DestinationRequest;
import com.electro.model.reponse.inventory.DestinationResponse;
import com.electro.model.request.inventory.DocketReasonRequest;
import com.electro.model.reponse.inventory.DocketReasonResponse;
import com.electro.model.request.inventory.DocketRequest;
import com.electro.model.reponse.inventory.DocketResponse;
import com.electro.model.request.inventory.ProductInventoryLimitRequest;
import com.electro.model.reponse.inventory.ProductInventoryLimitResponse;
import com.electro.model.request.inventory.PurchaseOrderRequest;
import com.electro.model.reponse.inventory.PurchaseOrderResponse;
import com.electro.model.request.inventory.StorageLocationRequest;
import com.electro.model.reponse.inventory.StorageLocationResponse;
import com.electro.model.request.inventory.TransferRequest;
import com.electro.model.reponse.inventory.TransferResponse;
import com.electro.model.request.inventory.VariantInventoryLimitRequest;
import com.electro.model.reponse.inventory.VariantInventoryLimitResponse;
import com.electro.model.request.inventory.WarehouseRequest;
import com.electro.model.reponse.inventory.WarehouseResponse;
import com.electro.model.request.order.OrderCancellationReasonRequest;
import com.electro.model.reponse.order.OrderCancellationReasonResponse;
import com.electro.model.request.order.OrderRequest;
import com.electro.model.request.order.OrderResourceRequest;
import com.electro.model.reponse.order.OrderResourceResponse;
import com.electro.model.reponse.order.OrderResponse;
import com.electro.model.request.product.BrandRequest;
import com.electro.model.reponse.product.BrandResponse;
import com.electro.model.request.product.CategoryRequest;
import com.electro.model.reponse.product.CategoryResponse;
import com.electro.model.request.product.GuaranteeRequest;
import com.electro.model.reponse.product.GuaranteeResponse;
import com.electro.model.request.product.ProductRequest;
import com.electro.model.reponse.product.ProductResponse;
import com.electro.model.request.product.PropertyRequest;
import com.electro.model.reponse.product.PropertyResponse;
import com.electro.model.request.product.SpecificationRequest;
import com.electro.model.reponse.product.SpecificationResponse;
import com.electro.model.request.product.SupplierRequest;
import com.electro.model.reponse.product.SupplierResponse;
import com.electro.model.request.product.TagRequest;
import com.electro.model.reponse.product.TagResponse;
import com.electro.model.request.product.UnitRequest;
import com.electro.model.reponse.product.UnitResponse;
import com.electro.model.request.product.VariantRequest;
import com.electro.model.reponse.product.VariantResponse;
import com.electro.model.request.promotion.PromotionRequest;
import com.electro.model.reponse.promotion.PromotionResponse;
import com.electro.model.request.review.ReviewRequest;
import com.electro.model.reponse.review.ReviewResponse;
import com.electro.model.request.reward.RewardStrategyRequest;
import com.electro.model.reponse.reward.RewardStrategyResponse;
import com.electro.model.request.waybill.WaybillRequest;
import com.electro.model.reponse.waybill.WaybillResponse;
import com.electro.model.entity.address.Address;
import com.electro.model.entity.address.District;
import com.electro.model.entity.address.Ward;
import com.electro.model.entity.authentication.Role;
import com.electro.model.entity.authentication.User;
import com.electro.model.entity.cashbook.PaymentMethod;
import com.electro.model.entity.chat.Room;
import com.electro.model.entity.customer.Customer;
import com.electro.model.entity.customer.CustomerGroup;
import com.electro.model.entity.customer.CustomerResource;
import com.electro.model.entity.customer.CustomerStatus;
import com.electro.model.entity.employee.Department;
import com.electro.model.entity.employee.Employee;
import com.electro.model.entity.employee.JobLevel;
import com.electro.model.entity.employee.JobTitle;
import com.electro.model.entity.employee.JobType;
import com.electro.model.entity.employee.Office;
import com.electro.model.entity.general.Image;
import com.electro.model.entity.inventory.Count;
import com.electro.model.entity.inventory.Destination;
import com.electro.model.entity.inventory.DocketReason;
import com.electro.model.entity.inventory.ProductInventoryLimit;
import com.electro.model.entity.inventory.PurchaseOrder;
import com.electro.model.entity.inventory.StorageLocation;
import com.electro.model.entity.inventory.Transfer;
import com.electro.model.entity.inventory.VariantInventoryLimit;
import com.electro.model.entity.inventory.Warehouse;
import com.electro.model.entity.order.Order;
import com.electro.model.entity.order.OrderCancellationReason;
import com.electro.model.entity.order.OrderResource;
import com.electro.model.entity.product.Brand;
import com.electro.model.entity.product.Category;
import com.electro.model.entity.product.Guarantee;
import com.electro.model.entity.product.Product;
import com.electro.model.entity.product.Property;
import com.electro.model.entity.product.Specification;
import com.electro.model.entity.product.Supplier;
import com.electro.model.entity.product.Tag;
import com.electro.model.entity.product.Unit;
import com.electro.model.entity.product.Variant;
import com.electro.model.entity.reward.RewardStrategy;
import com.electro.mapper.address.AddressMapper;
import com.electro.mapper.address.DistrictMapper;
import com.electro.mapper.address.WardMapper;
import com.electro.mapper.authentication.RoleMapper;
import com.electro.mapper.authentication.UserMapper;
import com.electro.mapper.cashbook.PaymentMethodMapper;
import com.electro.mapper.chat.RoomMapper;
import com.electro.mapper.customer.CustomerGroupMapper;
import com.electro.mapper.customer.CustomerMapper;
import com.electro.mapper.customer.CustomerResourceMapper;
import com.electro.mapper.customer.CustomerStatusMapper;
import com.electro.mapper.employee.DepartmentMapper;
import com.electro.mapper.employee.EmployeeMapper;
import com.electro.mapper.employee.JobLevelMapper;
import com.electro.mapper.employee.JobTitleMapper;
import com.electro.mapper.employee.JobTypeMapper;
import com.electro.mapper.employee.OfficeMapper;
import com.electro.mapper.general.ImageMapper;
import com.electro.mapper.inventory.CountMapper;
import com.electro.mapper.inventory.DestinationMapper;
import com.electro.mapper.inventory.DocketReasonMapper;
import com.electro.mapper.inventory.ProductInventoryLimitMapper;
import com.electro.mapper.inventory.PurchaseOrderMapper;
import com.electro.mapper.inventory.StorageLocationMapper;
import com.electro.mapper.inventory.TransferMapper;
import com.electro.mapper.inventory.VariantInventoryLimitMapper;
import com.electro.mapper.inventory.WarehouseMapper;
import com.electro.mapper.order.OrderCancellationReasonMapper;
import com.electro.mapper.order.OrderMapper;
import com.electro.mapper.order.OrderResourceMapper;
import com.electro.mapper.product.BrandMapper;
import com.electro.mapper.product.CategoryMapper;
import com.electro.mapper.product.GuaranteeMapper;
import com.electro.mapper.product.ProductMapper;
import com.electro.mapper.product.PropertyMapper;
import com.electro.mapper.product.SpecificationMapper;
import com.electro.mapper.product.SupplierMapper;
import com.electro.mapper.product.TagMapper;
import com.electro.mapper.product.UnitMapper;
import com.electro.mapper.product.VariantMapper;
import com.electro.mapper.reward.RewardStrategyMapper;
import com.electro.repository.address.AddressRepository;
import com.electro.repository.address.DistrictRepository;
import com.electro.repository.address.WardRepository;
import com.electro.repository.authentication.RoleRepository;
import com.electro.repository.authentication.UserRepository;
import com.electro.repository.cashbook.PaymentMethodRepository;
import com.electro.repository.chat.RoomRepository;
import com.electro.repository.customer.CustomerGroupRepository;
import com.electro.repository.customer.CustomerRepository;
import com.electro.repository.customer.CustomerResourceRepository;
import com.electro.repository.customer.CustomerStatusRepository;
import com.electro.repository.employee.DepartmentRepository;
import com.electro.repository.employee.EmployeeRepository;
import com.electro.repository.employee.JobLevelRepository;
import com.electro.repository.employee.JobTitleRepository;
import com.electro.repository.employee.JobTypeRepository;
import com.electro.repository.employee.OfficeRepository;
import com.electro.repository.general.ImageRepository;
import com.electro.repository.inventory.CountRepository;
import com.electro.repository.inventory.DestinationRepository;
import com.electro.repository.inventory.DocketReasonRepository;
import com.electro.repository.inventory.ProductInventoryLimitRepository;
import com.electro.repository.inventory.PurchaseOrderRepository;
import com.electro.repository.inventory.StorageLocationRepository;
import com.electro.repository.inventory.TransferRepository;
import com.electro.repository.inventory.VariantInventoryLimitRepository;
import com.electro.repository.inventory.WarehouseRepository;
import com.electro.repository.order.OrderCancellationReasonRepository;
import com.electro.repository.order.OrderRepository;
import com.electro.repository.order.OrderResourceRepository;
import com.electro.repository.product.BrandRepository;
import com.electro.repository.product.CategoryRepository;
import com.electro.repository.product.GuaranteeRepository;
import com.electro.repository.product.ProductRepository;
import com.electro.repository.product.PropertyRepository;
import com.electro.repository.product.SpecificationRepository;
import com.electro.repository.product.SupplierRepository;
import com.electro.repository.product.TagRepository;
import com.electro.repository.product.UnitRepository;
import com.electro.repository.product.VariantRepository;
import com.electro.repository.reward.RewardStrategyRepository;
import com.electro.service.CrudService;
import com.electro.service.GenericService;
import com.electro.service.address.ProvinceService;
import com.electro.service.inventory.DocketService;
import com.electro.service.promotion.PromotionService;
import com.electro.service.review.ReviewService;
import com.electro.service.waybill.WaybillService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.util.pattern.PathPatternParser;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class GenericMappingRegister {

    private final ApplicationContext context;
    private final RequestMappingHandlerMapping handlerMapping;

    // Controllers
    private final GenericController<ProvinceRequest, ProvinceResponse> provinceController;
    private final GenericController<DistrictRequest, DistrictResponse> districtController;
    private final GenericController<WardRequest, WardResponse> wardController;
    private final GenericController<AddressRequest, AddressResponse> addressController;
    private final GenericController<UserRequest, UserResponse> userController;
    private final GenericController<RoleRequest, RoleResponse> roleController;
    private final GenericController<OfficeRequest, OfficeResponse> officeController;
    private final GenericController<DepartmentRequest, DepartmentResponse> departmentController;
    private final GenericController<JobLevelRequest, JobLevelResponse> jobLevelController;
    private final GenericController<JobTypeRequest, JobTypeResponse> jobTypeController;
    private final GenericController<JobTitleRequest, JobTitleResponse> jobTitleController;
    private final GenericController<EmployeeRequest, EmployeeResponse> employeeController;
    private final GenericController<CustomerGroupRequest, CustomerGroupResponse> customerGroupController;
    private final GenericController<CustomerResourceRequest, CustomerResourceResponse> customerResourceController;
    private final GenericController<CustomerStatusRequest, CustomerStatusResponse> customerStatusController;
    private final GenericController<CustomerRequest, CustomerResponse> customerController;
    private final GenericController<PropertyRequest, PropertyResponse> propertyController;
    private final GenericController<CategoryRequest, CategoryResponse> categoryController;
    private final GenericController<TagRequest, TagResponse> tagController;
    private final GenericController<GuaranteeRequest, GuaranteeResponse> guaranteeController;
    private final GenericController<UnitRequest, UnitResponse> unitController;
    private final GenericController<SupplierRequest, SupplierResponse> supplierController;
    private final GenericController<BrandRequest, BrandResponse> brandController;
    private final GenericController<SpecificationRequest, SpecificationResponse> specificationController;
    private final GenericController<ProductRequest, ProductResponse> productController;
    private final GenericController<VariantRequest, VariantResponse> variantController;
    private final GenericController<ImageRequest, ImageResponse> imageController;
    private final GenericController<ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitController;
    private final GenericController<VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitController;
    private final GenericController<WarehouseRequest, WarehouseResponse> warehouseController;
    private final GenericController<CountRequest, CountResponse> countController;
    private final GenericController<DestinationRequest, DestinationResponse> destinationController;
    private final GenericController<DocketReasonRequest, DocketReasonResponse> docketReasonController;
    private final GenericController<TransferRequest, TransferResponse> transferController;
    private final GenericController<DocketRequest, DocketResponse> docketController;
    private final GenericController<StorageLocationRequest, StorageLocationResponse> storageLocationController;
    private final GenericController<PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderController;
    private final GenericController<OrderResourceRequest, OrderResourceResponse> orderResourceController;
    private final GenericController<OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonController;
    private final GenericController<OrderRequest, OrderResponse> orderController;
    private final GenericController<WaybillRequest, WaybillResponse> waybillController;
    private final GenericController<ReviewRequest, ReviewResponse> reviewController;
    private final GenericController<PaymentMethodRequest, PaymentMethodResponse> paymentMethodController;
    private final GenericController<PromotionRequest, PromotionResponse> promotionController;
    private final GenericController<RoomRequest, RoomResponse> roomController;
    private final GenericController<RewardStrategyRequest, RewardStrategyResponse> rewardStrategyController;

    // Services
    private final GenericService<District, DistrictRequest, DistrictResponse> districtService;
    private final GenericService<Ward, WardRequest, WardResponse> wardService;
    private final GenericService<Address, AddressRequest, AddressResponse> addressService;
    private final GenericService<User, UserRequest, UserResponse> userService;
    private final GenericService<Role, RoleRequest, RoleResponse> roleService;
    private final GenericService<Office, OfficeRequest, OfficeResponse> officeService;
    private final GenericService<Department, DepartmentRequest, DepartmentResponse> departmentService;
    private final GenericService<JobLevel, JobLevelRequest, JobLevelResponse> jobLevelService;
    private final GenericService<JobType, JobTypeRequest, JobTypeResponse> jobTypeService;
    private final GenericService<JobTitle, JobTitleRequest, JobTitleResponse> jobTitleService;
    private final GenericService<Employee, EmployeeRequest, EmployeeResponse> employeeService;
    private final GenericService<CustomerGroup, CustomerGroupRequest, CustomerGroupResponse> customerGroupService;
    private final GenericService<CustomerResource, CustomerResourceRequest, CustomerResourceResponse> customerResourceService;
    private final GenericService<CustomerStatus, CustomerStatusRequest, CustomerStatusResponse> customerStatusService;
    private final GenericService<Customer, CustomerRequest, CustomerResponse> customerService;
    private final GenericService<Property, PropertyRequest, PropertyResponse> propertyService;
    private final GenericService<Category, CategoryRequest, CategoryResponse> categoryService;
    private final GenericService<Tag, TagRequest, TagResponse> tagService;
    private final GenericService<Guarantee, GuaranteeRequest, GuaranteeResponse> guaranteeService;
    private final GenericService<Unit, UnitRequest, UnitResponse> unitService;
    private final GenericService<Supplier, SupplierRequest, SupplierResponse> supplierService;
    private final GenericService<Brand, BrandRequest, BrandResponse> brandService;
    private final GenericService<Specification, SpecificationRequest, SpecificationResponse> specificationService;
    private final GenericService<Product, ProductRequest, ProductResponse> productService;
    private final GenericService<Variant, VariantRequest, VariantResponse> variantService;
    private final GenericService<Image, ImageRequest, ImageResponse> imageService;
    private final GenericService<ProductInventoryLimit, ProductInventoryLimitRequest, ProductInventoryLimitResponse> productInventoryLimitService;
    private final GenericService<VariantInventoryLimit, VariantInventoryLimitRequest, VariantInventoryLimitResponse> variantInventoryLimitService;
    private final GenericService<Warehouse, WarehouseRequest, WarehouseResponse> warehouseService;
    private final GenericService<Count, CountRequest, CountResponse> countService;
    private final GenericService<Destination, DestinationRequest, DestinationResponse> destinationService;
    private final GenericService<DocketReason, DocketReasonRequest, DocketReasonResponse> docketReasonService;
    private final GenericService<Transfer, TransferRequest, TransferResponse> transferService;
    private final GenericService<StorageLocation, StorageLocationRequest, StorageLocationResponse> storageLocationService;
    private final GenericService<PurchaseOrder, PurchaseOrderRequest, PurchaseOrderResponse> purchaseOrderService;
    private final GenericService<OrderResource, OrderResourceRequest, OrderResourceResponse> orderResourceService;
    private final GenericService<OrderCancellationReason, OrderCancellationReasonRequest, OrderCancellationReasonResponse> orderCancellationReasonService;
    private final GenericService<Order, OrderRequest, OrderResponse> orderService;
    private final GenericService<PaymentMethod, PaymentMethodRequest, PaymentMethodResponse> paymentMethodService;
    private final GenericService<Room, RoomRequest, RoomResponse> roomService;
    private final GenericService<RewardStrategy, RewardStrategyRequest, RewardStrategyResponse> rewardStrategyService;

    @PostConstruct
    public void registerControllers() throws NoSuchMethodException {

        register("provinces", provinceController, context.getBean(ProvinceService.class), ProvinceRequest.class);

        register("districts", districtController, districtService.init(
                context.getBean(DistrictRepository.class),
                context.getBean(DistrictMapper.class),
                SearchFields.DISTRICT.getFields(),
                ResourceName.DISTRICT.getResourceName()
        ), DistrictRequest.class);

        register("wards", wardController, wardService.init(
                context.getBean(WardRepository.class),
                context.getBean(WardMapper.class),
                SearchFields.WARD.getFields(),
                ResourceName.WARD.getResourceName()
        ), WardRequest.class);

        register("addresses", addressController, addressService.init(
                context.getBean(AddressRepository.class),
                context.getBean(AddressMapper.class),
                SearchFields.ADDRESS.getFields(),
                ResourceName.ADDRESS.getResourceName()
        ), AddressRequest.class);

        register("users", userController, userService.init(
                context.getBean(UserRepository.class),
                context.getBean(UserMapper.class),
                SearchFields.USER.getFields(),
                ResourceName.USER.getResourceName()
        ), UserRequest.class);

        register("roles", roleController, roleService.init(
                context.getBean(RoleRepository.class),
                context.getBean(RoleMapper.class),
                SearchFields.ROLE.getFields(),
                ResourceName.ROLE.getResourceName()
        ), RoleRequest.class);

        register("offices", officeController, officeService.init(
                context.getBean(OfficeRepository.class),
                context.getBean(OfficeMapper.class),
                SearchFields.OFFICE.getFields(),
                ResourceName.OFFICE.getResourceName()
        ), OfficeRequest.class);

        register("departments", departmentController, departmentService.init(
                context.getBean(DepartmentRepository.class),
                context.getBean(DepartmentMapper.class),
                SearchFields.DEPARTMENT.getFields(),
                ResourceName.DEPARTMENT.getResourceName()
        ), DepartmentRequest.class);

        register("job-levels", jobLevelController, jobLevelService.init(
                context.getBean(JobLevelRepository.class),
                context.getBean(JobLevelMapper.class),
                SearchFields.JOB_LEVEL.getFields(),
                ResourceName.JOB_LEVEL.getResourceName()
        ), JobLevelRequest.class);

        register("job-titles", jobTitleController, jobTitleService.init(
                context.getBean(JobTitleRepository.class),
                context.getBean(JobTitleMapper.class),
                SearchFields.JOB_TITLE.getFields(),
                ResourceName.JOB_TITLE.getResourceName()
        ), JobTitleRequest.class);

        register("job-types", jobTypeController, jobTypeService.init(
                context.getBean(JobTypeRepository.class),
                context.getBean(JobTypeMapper.class),
                SearchFields.JOB_TYPE.getFields(),
                ResourceName.JOB_TYPE.getResourceName()
        ), JobTypeRequest.class);

        register("employees", employeeController, employeeService.init(
                context.getBean(EmployeeRepository.class),
                context.getBean(EmployeeMapper.class),
                SearchFields.EMPLOYEE.getFields(),
                ResourceName.EMPLOYEE.getResourceName()
        ), EmployeeRequest.class);

        register("customer-groups", customerGroupController, customerGroupService.init(
                context.getBean(CustomerGroupRepository.class),
                context.getBean(CustomerGroupMapper.class),
                SearchFields.CUSTOMER_GROUP.getFields(),
                ResourceName.CUSTOMER_GROUP.getResourceName()
        ), CustomerGroupRequest.class);

        register("customer-resources", customerResourceController, customerResourceService.init(
                context.getBean(CustomerResourceRepository.class),
                context.getBean(CustomerResourceMapper.class),
                SearchFields.CUSTOMER_RESOURCE.getFields(),
                ResourceName.CUSTOMER_RESOURCE.getResourceName()
        ), CustomerResourceRequest.class);

        register("customer-status", customerStatusController, customerStatusService.init(
                context.getBean(CustomerStatusRepository.class),
                context.getBean(CustomerStatusMapper.class),
                SearchFields.CUSTOMER_STATUS.getFields(),
                ResourceName.CUSTOMER_STATUS.getResourceName()
        ), CustomerStatusRequest.class);

        register("customers", customerController, customerService.init(
                context.getBean(CustomerRepository.class),
                context.getBean(CustomerMapper.class),
                SearchFields.CUSTOMER.getFields(),
                ResourceName.CUSTOMER.getResourceName()
        ), CustomerRequest.class);

        register("properties", propertyController, propertyService.init(
                context.getBean(PropertyRepository.class),
                context.getBean(PropertyMapper.class),
                SearchFields.PROPERTY.getFields(),
                ResourceName.PROPERTY.getResourceName()
        ), PropertyRequest.class);

        register("categories", categoryController, categoryService.init(
                context.getBean(CategoryRepository.class),
                context.getBean(CategoryMapper.class),
                SearchFields.CATEGORY.getFields(),
                ResourceName.CATEGORY.getResourceName()
        ), CategoryRequest.class);

        register("tags", tagController, tagService.init(
                context.getBean(TagRepository.class),
                context.getBean(TagMapper.class),
                SearchFields.TAG.getFields(),
                ResourceName.TAG.getResourceName()
        ), TagRequest.class);

        register("guarantees", guaranteeController, guaranteeService.init(
                context.getBean(GuaranteeRepository.class),
                context.getBean(GuaranteeMapper.class),
                SearchFields.GUARANTEE.getFields(),
                ResourceName.GUARANTEE.getResourceName()
        ), GuaranteeRequest.class);

        register("units", unitController, unitService.init(
                context.getBean(UnitRepository.class),
                context.getBean(UnitMapper.class),
                SearchFields.UNIT.getFields(),
                ResourceName.UNIT.getResourceName()
        ), UnitRequest.class);

        register("suppliers", supplierController, supplierService.init(
                context.getBean(SupplierRepository.class),
                context.getBean(SupplierMapper.class),
                SearchFields.SUPPLIER.getFields(),
                ResourceName.SUPPLIER.getResourceName()
        ), SupplierRequest.class);

        register("brands", brandController, brandService.init(
                context.getBean(BrandRepository.class),
                context.getBean(BrandMapper.class),
                SearchFields.BRAND.getFields(),
                ResourceName.BRAND.getResourceName()
        ), BrandRequest.class);

        register("specifications", specificationController, specificationService.init(
                context.getBean(SpecificationRepository.class),
                context.getBean(SpecificationMapper.class),
                SearchFields.SPECIFICATION.getFields(),
                ResourceName.SPECIFICATION.getResourceName()
        ), SpecificationRequest.class);

        register("products", productController, productService.init(
                context.getBean(ProductRepository.class),
                context.getBean(ProductMapper.class),
                SearchFields.PRODUCT.getFields(),
                ResourceName.PRODUCT.getResourceName()
        ), ProductRequest.class);

        register("variants", variantController, variantService.init(
                context.getBean(VariantRepository.class),
                context.getBean(VariantMapper.class),
                SearchFields.VARIANT.getFields(),
                ResourceName.VARIANT.getResourceName()
        ), VariantRequest.class);

        register("images", imageController, imageService.init(
                context.getBean(ImageRepository.class),
                context.getBean(ImageMapper.class),
                SearchFields.IMAGE.getFields(),
                ResourceName.IMAGE.getResourceName()
        ), ImageRequest.class);

        register("product-inventory-limits", productInventoryLimitController, productInventoryLimitService.init(
                context.getBean(ProductInventoryLimitRepository.class),
                context.getBean(ProductInventoryLimitMapper.class),
                SearchFields.PRODUCT_INVENTORY_LIMIT.getFields(),
                ResourceName.PRODUCT_INVENTORY_LIMIT.getResourceName()
        ), ProductInventoryLimitRequest.class);

        register("variant-inventory-limits", variantInventoryLimitController, variantInventoryLimitService.init(
                context.getBean(VariantInventoryLimitRepository.class),
                context.getBean(VariantInventoryLimitMapper.class),
                SearchFields.VARIANT_INVENTORY_LIMIT.getFields(),
                ResourceName.VARIANT_INVENTORY_LIMIT.getResourceName()
        ), VariantInventoryLimitRequest.class);

        register("warehouses", warehouseController, warehouseService.init(
                context.getBean(WarehouseRepository.class),
                context.getBean(WarehouseMapper.class),
                SearchFields.WAREHOUSE.getFields(),
                ResourceName.WAREHOUSE.getResourceName()
        ), WarehouseRequest.class);

        register("counts", countController, countService.init(
                context.getBean(CountRepository.class),
                context.getBean(CountMapper.class),
                SearchFields.COUNT.getFields(),
                ResourceName.COUNT.getResourceName()
        ), CountRequest.class);

        register("destinations", destinationController, destinationService.init(
                context.getBean(DestinationRepository.class),
                context.getBean(DestinationMapper.class),
                SearchFields.DESTINATION.getFields(),
                ResourceName.DESTINATION.getResourceName()
        ), DestinationRequest.class);

        register("docket-reasons", docketReasonController, docketReasonService.init(
                context.getBean(DocketReasonRepository.class),
                context.getBean(DocketReasonMapper.class),
                SearchFields.DOCKET_REASON.getFields(),
                ResourceName.DOCKET_REASON.getResourceName()
        ), DocketReasonRequest.class);

        register("transfers", transferController, transferService.init(
                context.getBean(TransferRepository.class),
                context.getBean(TransferMapper.class),
                SearchFields.TRANSFER.getFields(),
                ResourceName.TRANSFER.getResourceName()
        ), TransferRequest.class);

        register("dockets", docketController, context.getBean(DocketService.class), DocketRequest.class);

        register("storage-locations", storageLocationController, storageLocationService.init(
                context.getBean(StorageLocationRepository.class),
                context.getBean(StorageLocationMapper.class),
                SearchFields.STORAGE_LOCATION.getFields(),
                ResourceName.STORAGE_LOCATION.getResourceName()
        ), StorageLocationRequest.class);

        register("purchase-orders", purchaseOrderController, purchaseOrderService.init(
                context.getBean(PurchaseOrderRepository.class),
                context.getBean(PurchaseOrderMapper.class),
                SearchFields.PURCHASE_ORDER.getFields(),
                ResourceName.PURCHASE_ORDER.getResourceName()
        ), PurchaseOrderRequest.class);

        register("order-resources", orderResourceController, orderResourceService.init(
                context.getBean(OrderResourceRepository.class),
                context.getBean(OrderResourceMapper.class),
                SearchFields.ORDER_RESOURCE.getFields(),
                ResourceName.ORDER_RESOURCE.getResourceName()
        ), OrderResourceRequest.class);

        register("order-cancellation-reasons", orderCancellationReasonController, orderCancellationReasonService.init(
                context.getBean(OrderCancellationReasonRepository.class),
                context.getBean(OrderCancellationReasonMapper.class),
                SearchFields.ORDER_CANCELLATION_REASON.getFields(),
                ResourceName.ORDER_CANCELLATION_REASON.getResourceName()
        ), OrderCancellationReasonRequest.class);

        register("orders", orderController, orderService.init(
                context.getBean(OrderRepository.class),
                context.getBean(OrderMapper.class),
                SearchFields.ORDER.getFields(),
                ResourceName.ORDER.getResourceName()
        ), OrderRequest.class);

        register("waybills", waybillController, context.getBean(WaybillService.class), WaybillRequest.class);

        register("reviews", reviewController, context.getBean(ReviewService.class), ReviewRequest.class);

        register("payment-methods", paymentMethodController, paymentMethodService.init(
                context.getBean(PaymentMethodRepository.class),
                context.getBean(PaymentMethodMapper.class),
                SearchFields.PAYMENT_METHOD.getFields(),
                ResourceName.PAYMENT_METHOD.getResourceName()
        ), PaymentMethodRequest.class);

        register("promotions", promotionController, context.getBean(PromotionService.class), PromotionRequest.class);

        register("rooms", roomController, roomService.init(
                context.getBean(RoomRepository.class),
                context.getBean(RoomMapper.class),
                SearchFields.ROOM.getFields(),
                ResourceName.ROOM.getResourceName()
        ), RoomRequest.class);

        register("reward-strategies", rewardStrategyController, rewardStrategyService.init(
                context.getBean(RewardStrategyRepository.class),
                context.getBean(RewardStrategyMapper.class),
                SearchFields.REWARD_STRATEGY.getFields(),
                ResourceName.REWARD_STRATEGY.getResourceName()
        ), RewardStrategyRequest.class);

    }

    private <I, O> void register(String resource,
                                 GenericController<I, O> controller,
                                 CrudService<Long, I, O> service,
                                 Class<I> requestType
    ) throws NoSuchMethodException {
        RequestMappingInfo.BuilderConfiguration options = new RequestMappingInfo.BuilderConfiguration();
        options.setPatternParser(new PathPatternParser());

        controller.setCrudService(service);
        controller.setRequestType(requestType);

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getAllResources", int.class, int.class,
                        String.class, String.class, String.class, boolean.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.GET)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("getResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.POST)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("createResource", JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.PUT)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .produces(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("updateResource", Long.class, JsonNode.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource + "/{id}")
                        .methods(RequestMethod.DELETE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResource", Long.class)
        );

        handlerMapping.registerMapping(
                RequestMappingInfo.paths("/api/" + resource)
                        .methods(RequestMethod.DELETE)
                        .consumes(MediaType.APPLICATION_JSON_VALUE)
                        .options(options)
                        .build(),
                controller,
                controller.getClass().getMethod("deleteResources", List.class)
        );
    }

}
