
package safedata;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the safedata package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RetentionSettings_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "retentionSettings");
    private final static QName _GetPolicyByDiskSafeResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyByDiskSafeResponse");
    private final static QName _GetPolicies_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicies");
    private final static QName _DeletePolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "deletePolicy");
    private final static QName _AccessControlFault_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "AccessControlFault");
    private final static QName _OperationFailedFault_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "OperationFailedFault");
    private final static QName _Device_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "device");
    private final static QName _FrequencyValues_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "frequencyValues");
    private final static QName _GetPolicyByDiskSafe_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyByDiskSafe");
    private final static QName _RunPolicyByID_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runPolicyByID");
    private final static QName _RunPolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runPolicy");
    private final static QName _RefreshPolicyFromDiskSafe_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "refreshPolicyFromDiskSafe");
    private final static QName _RunPolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runPolicyResponse");
    private final static QName _DiskSafe_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "diskSafe");
    private final static QName _RefreshPolicyFromDiskSafeResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "refreshPolicyFromDiskSafeResponse");
    private final static QName _RunDiskSafeVerificationByPolicyIDResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runDiskSafeVerificationByPolicyIDResponse");
    private final static QName _DeletePolicyById_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "deletePolicyById");
    private final static QName _UnknownObjectFault_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "UnknownObjectFault");
    private final static QName _CreatePolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "createPolicy");
    private final static QName _GetPolicyById_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyById");
    private final static QName _GetPolicyIDs_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyIDs");
    private final static QName _RunDiskSafeVerification_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runDiskSafeVerification");
    private final static QName _CreatePolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "createPolicyResponse");
    private final static QName _UpdatePolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "updatePolicy");
    private final static QName _GetPolicyByDiskSafeId_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyByDiskSafeId");
    private final static QName _EnablePolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "enablePolicyResponse");
    private final static QName _FileExclusionProperty_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "fileExclusionProperty");
    private final static QName _EnablePolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "enablePolicy");
    private final static QName _Policy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "policy");
    private final static QName _RunDiskSafeVerificationResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runDiskSafeVerificationResponse");
    private final static QName _DisablePolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "disablePolicyResponse");
    private final static QName _ExchangeSettings_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "exchangeSettings");
    private final static QName _ArchiveScheduleInstance_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "archiveScheduleInstance");
    private final static QName _SqlServerSettings_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "sqlServerSettings");
    private final static QName _DeletePolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "deletePolicyResponse");
    private final static QName _GetPoliciesResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPoliciesResponse");
    private final static QName _TaskExecutionContext_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "taskExecutionContext");
    private final static QName _RunDiskSafeVerificationByPolicyID_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runDiskSafeVerificationByPolicyID");
    private final static QName _UpdatePolicyResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "updatePolicyResponse");
    private final static QName _GetPolicyByIdResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyByIdResponse");
    private final static QName _DisablePolicy_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "disablePolicy");
    private final static QName _GetPolicyIDsResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyIDsResponse");
    private final static QName _RunPolicyByIDResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "runPolicyByIDResponse");
    private final static QName _DeletePolicyByIdResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "deletePolicyByIdResponse");
    private final static QName _GetPolicyByDiskSafeIdResponse_QNAME = new QName("http://policy.apiV2.server.backup.r1soft.com/", "getPolicyByDiskSafeIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: safedata
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatabaseInstance }
     * 
     */
    public DatabaseInstance createDatabaseInstance() {
        return new DatabaseInstance();
    }

    /**
     * Create an instance of {@link DatabaseInstance.AdvancedOptions }
     * 
     */
    public DatabaseInstance.AdvancedOptions createDatabaseInstanceAdvancedOptions() {
        return new DatabaseInstance.AdvancedOptions();
    }

    /**
     * Create an instance of {@link ControlPanelInstance }
     * 
     */
    public ControlPanelInstance createControlPanelInstance() {
        return new ControlPanelInstance();
    }

    /**
     * Create an instance of {@link ControlPanelInstance.AdvancedOptions }
     * 
     */
    public ControlPanelInstance.AdvancedOptions createControlPanelInstanceAdvancedOptions() {
        return new ControlPanelInstance.AdvancedOptions();
    }

    /**
     * Create an instance of {@link DiskSafe }
     * 
     */
    public DiskSafe createDiskSafe() {
        return new DiskSafe();
    }

    /**
     * Create an instance of {@link DiskSafe.DiskSafeAttributeMap }
     * 
     */
    public DiskSafe.DiskSafeAttributeMap createDiskSafeDiskSafeAttributeMap() {
        return new DiskSafe.DiskSafeAttributeMap();
    }

    /**
     * Create an instance of {@link GetPoliciesResponse }
     * 
     */
    public GetPoliciesResponse createGetPoliciesResponse() {
        return new GetPoliciesResponse();
    }

    /**
     * Create an instance of {@link ArchiveScheduleInstance }
     * 
     */
    public ArchiveScheduleInstance createArchiveScheduleInstance() {
        return new ArchiveScheduleInstance();
    }

    /**
     * Create an instance of {@link ExchangeSettings }
     * 
     */
    public ExchangeSettings createExchangeSettings() {
        return new ExchangeSettings();
    }

    /**
     * Create an instance of {@link SqlServerSettings }
     * 
     */
    public SqlServerSettings createSqlServerSettings() {
        return new SqlServerSettings();
    }

    /**
     * Create an instance of {@link DeletePolicyResponse }
     * 
     */
    public DeletePolicyResponse createDeletePolicyResponse() {
        return new DeletePolicyResponse();
    }

    /**
     * Create an instance of {@link RunPolicyByIDResponse }
     * 
     */
    public RunPolicyByIDResponse createRunPolicyByIDResponse() {
        return new RunPolicyByIDResponse();
    }

    /**
     * Create an instance of {@link GetPolicyIDsResponse }
     * 
     */
    public GetPolicyIDsResponse createGetPolicyIDsResponse() {
        return new GetPolicyIDsResponse();
    }

    /**
     * Create an instance of {@link DeletePolicyByIdResponse }
     * 
     */
    public DeletePolicyByIdResponse createDeletePolicyByIdResponse() {
        return new DeletePolicyByIdResponse();
    }

    /**
     * Create an instance of {@link GetPolicyByDiskSafeIdResponse }
     * 
     */
    public GetPolicyByDiskSafeIdResponse createGetPolicyByDiskSafeIdResponse() {
        return new GetPolicyByDiskSafeIdResponse();
    }

    /**
     * Create an instance of {@link RunDiskSafeVerificationByPolicyID }
     * 
     */
    public RunDiskSafeVerificationByPolicyID createRunDiskSafeVerificationByPolicyID() {
        return new RunDiskSafeVerificationByPolicyID();
    }

    /**
     * Create an instance of {@link TaskExecutionContext }
     * 
     */
    public TaskExecutionContext createTaskExecutionContext() {
        return new TaskExecutionContext();
    }

    /**
     * Create an instance of {@link GetPolicyByIdResponse }
     * 
     */
    public GetPolicyByIdResponse createGetPolicyByIdResponse() {
        return new GetPolicyByIdResponse();
    }

    /**
     * Create an instance of {@link DisablePolicy }
     * 
     */
    public DisablePolicy createDisablePolicy() {
        return new DisablePolicy();
    }

    /**
     * Create an instance of {@link UpdatePolicyResponse }
     * 
     */
    public UpdatePolicyResponse createUpdatePolicyResponse() {
        return new UpdatePolicyResponse();
    }

    /**
     * Create an instance of {@link EnablePolicyResponse }
     * 
     */
    public EnablePolicyResponse createEnablePolicyResponse() {
        return new EnablePolicyResponse();
    }

    /**
     * Create an instance of {@link GetPolicyByDiskSafeId }
     * 
     */
    public GetPolicyByDiskSafeId createGetPolicyByDiskSafeId() {
        return new GetPolicyByDiskSafeId();
    }

    /**
     * Create an instance of {@link RunDiskSafeVerification }
     * 
     */
    public RunDiskSafeVerification createRunDiskSafeVerification() {
        return new RunDiskSafeVerification();
    }

    /**
     * Create an instance of {@link UpdatePolicy }
     * 
     */
    public UpdatePolicy createUpdatePolicy() {
        return new UpdatePolicy();
    }

    /**
     * Create an instance of {@link CreatePolicyResponse }
     * 
     */
    public CreatePolicyResponse createCreatePolicyResponse() {
        return new CreatePolicyResponse();
    }

    /**
     * Create an instance of {@link RunDiskSafeVerificationResponse }
     * 
     */
    public RunDiskSafeVerificationResponse createRunDiskSafeVerificationResponse() {
        return new RunDiskSafeVerificationResponse();
    }

    /**
     * Create an instance of {@link DisablePolicyResponse }
     * 
     */
    public DisablePolicyResponse createDisablePolicyResponse() {
        return new DisablePolicyResponse();
    }

    /**
     * Create an instance of {@link FileExclusionProperty }
     * 
     */
    public FileExclusionProperty createFileExclusionProperty() {
        return new FileExclusionProperty();
    }

    /**
     * Create an instance of {@link EnablePolicy }
     * 
     */
    public EnablePolicy createEnablePolicy() {
        return new EnablePolicy();
    }

    /**
     * Create an instance of {@link Policy }
     * 
     */
    public Policy createPolicy() {
        return new Policy();
    }

    /**
     * Create an instance of {@link RunDiskSafeVerificationByPolicyIDResponse }
     * 
     */
    public RunDiskSafeVerificationByPolicyIDResponse createRunDiskSafeVerificationByPolicyIDResponse() {
        return new RunDiskSafeVerificationByPolicyIDResponse();
    }

    /**
     * Create an instance of {@link DeletePolicyById }
     * 
     */
    public DeletePolicyById createDeletePolicyById() {
        return new DeletePolicyById();
    }

    /**
     * Create an instance of {@link RefreshPolicyFromDiskSafeResponse }
     * 
     */
    public RefreshPolicyFromDiskSafeResponse createRefreshPolicyFromDiskSafeResponse() {
        return new RefreshPolicyFromDiskSafeResponse();
    }

    /**
     * Create an instance of {@link GetPolicyIDs }
     * 
     */
    public GetPolicyIDs createGetPolicyIDs() {
        return new GetPolicyIDs();
    }

    /**
     * Create an instance of {@link CreatePolicy }
     * 
     */
    public CreatePolicy createCreatePolicy() {
        return new CreatePolicy();
    }

    /**
     * Create an instance of {@link UnknownObjectFault }
     * 
     */
    public UnknownObjectFault createUnknownObjectFault() {
        return new UnknownObjectFault();
    }

    /**
     * Create an instance of {@link GetPolicyById }
     * 
     */
    public GetPolicyById createGetPolicyById() {
        return new GetPolicyById();
    }

    /**
     * Create an instance of {@link AccessControlFault }
     * 
     */
    public AccessControlFault createAccessControlFault() {
        return new AccessControlFault();
    }

    /**
     * Create an instance of {@link OperationFailedFault }
     * 
     */
    public OperationFailedFault createOperationFailedFault() {
        return new OperationFailedFault();
    }

    /**
     * Create an instance of {@link RetentionSettings }
     * 
     */
    public RetentionSettings createRetentionSettings() {
        return new RetentionSettings();
    }

    /**
     * Create an instance of {@link GetPolicyByDiskSafeResponse }
     * 
     */
    public GetPolicyByDiskSafeResponse createGetPolicyByDiskSafeResponse() {
        return new GetPolicyByDiskSafeResponse();
    }

    /**
     * Create an instance of {@link GetPolicies }
     * 
     */
    public GetPolicies createGetPolicies() {
        return new GetPolicies();
    }

    /**
     * Create an instance of {@link DeletePolicy }
     * 
     */
    public DeletePolicy createDeletePolicy() {
        return new DeletePolicy();
    }

    /**
     * Create an instance of {@link RefreshPolicyFromDiskSafe }
     * 
     */
    public RefreshPolicyFromDiskSafe createRefreshPolicyFromDiskSafe() {
        return new RefreshPolicyFromDiskSafe();
    }

    /**
     * Create an instance of {@link RunPolicyResponse }
     * 
     */
    public RunPolicyResponse createRunPolicyResponse() {
        return new RunPolicyResponse();
    }

    /**
     * Create an instance of {@link RunPolicyByID }
     * 
     */
    public RunPolicyByID createRunPolicyByID() {
        return new RunPolicyByID();
    }

    /**
     * Create an instance of {@link Device }
     * 
     */
    public Device createDevice() {
        return new Device();
    }

    /**
     * Create an instance of {@link FrequencyValues }
     * 
     */
    public FrequencyValues createFrequencyValues() {
        return new FrequencyValues();
    }

    /**
     * Create an instance of {@link GetPolicyByDiskSafe }
     * 
     */
    public GetPolicyByDiskSafe createGetPolicyByDiskSafe() {
        return new GetPolicyByDiskSafe();
    }

    /**
     * Create an instance of {@link RunPolicy }
     * 
     */
    public RunPolicy createRunPolicy() {
        return new RunPolicy();
    }

    /**
     * Create an instance of {@link DatabaseInstance.AdvancedOptions.Entry }
     * 
     */
    public DatabaseInstance.AdvancedOptions.Entry createDatabaseInstanceAdvancedOptionsEntry() {
        return new DatabaseInstance.AdvancedOptions.Entry();
    }

    /**
     * Create an instance of {@link ControlPanelInstance.AdvancedOptions.Entry }
     * 
     */
    public ControlPanelInstance.AdvancedOptions.Entry createControlPanelInstanceAdvancedOptionsEntry() {
        return new ControlPanelInstance.AdvancedOptions.Entry();
    }

    /**
     * Create an instance of {@link DiskSafe.DiskSafeAttributeMap.Entry }
     * 
     */
    public DiskSafe.DiskSafeAttributeMap.Entry createDiskSafeDiskSafeAttributeMapEntry() {
        return new DiskSafe.DiskSafeAttributeMap.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetentionSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "retentionSettings")
    public JAXBElement<RetentionSettings> createRetentionSettings(RetentionSettings value) {
        return new JAXBElement<RetentionSettings>(_RetentionSettings_QNAME, RetentionSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyByDiskSafeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyByDiskSafeResponse")
    public JAXBElement<GetPolicyByDiskSafeResponse> createGetPolicyByDiskSafeResponse(GetPolicyByDiskSafeResponse value) {
        return new JAXBElement<GetPolicyByDiskSafeResponse>(_GetPolicyByDiskSafeResponse_QNAME, GetPolicyByDiskSafeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicies")
    public JAXBElement<GetPolicies> createGetPolicies(GetPolicies value) {
        return new JAXBElement<GetPolicies>(_GetPolicies_QNAME, GetPolicies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "deletePolicy")
    public JAXBElement<DeletePolicy> createDeletePolicy(DeletePolicy value) {
        return new JAXBElement<DeletePolicy>(_DeletePolicy_QNAME, DeletePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessControlFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "AccessControlFault")
    public JAXBElement<AccessControlFault> createAccessControlFault(AccessControlFault value) {
        return new JAXBElement<AccessControlFault>(_AccessControlFault_QNAME, AccessControlFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationFailedFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "OperationFailedFault")
    public JAXBElement<OperationFailedFault> createOperationFailedFault(OperationFailedFault value) {
        return new JAXBElement<OperationFailedFault>(_OperationFailedFault_QNAME, OperationFailedFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Device }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "device")
    public JAXBElement<Device> createDevice(Device value) {
        return new JAXBElement<Device>(_Device_QNAME, Device.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FrequencyValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "frequencyValues")
    public JAXBElement<FrequencyValues> createFrequencyValues(FrequencyValues value) {
        return new JAXBElement<FrequencyValues>(_FrequencyValues_QNAME, FrequencyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyByDiskSafe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyByDiskSafe")
    public JAXBElement<GetPolicyByDiskSafe> createGetPolicyByDiskSafe(GetPolicyByDiskSafe value) {
        return new JAXBElement<GetPolicyByDiskSafe>(_GetPolicyByDiskSafe_QNAME, GetPolicyByDiskSafe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPolicyByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runPolicyByID")
    public JAXBElement<RunPolicyByID> createRunPolicyByID(RunPolicyByID value) {
        return new JAXBElement<RunPolicyByID>(_RunPolicyByID_QNAME, RunPolicyByID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runPolicy")
    public JAXBElement<RunPolicy> createRunPolicy(RunPolicy value) {
        return new JAXBElement<RunPolicy>(_RunPolicy_QNAME, RunPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshPolicyFromDiskSafe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "refreshPolicyFromDiskSafe")
    public JAXBElement<RefreshPolicyFromDiskSafe> createRefreshPolicyFromDiskSafe(RefreshPolicyFromDiskSafe value) {
        return new JAXBElement<RefreshPolicyFromDiskSafe>(_RefreshPolicyFromDiskSafe_QNAME, RefreshPolicyFromDiskSafe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runPolicyResponse")
    public JAXBElement<RunPolicyResponse> createRunPolicyResponse(RunPolicyResponse value) {
        return new JAXBElement<RunPolicyResponse>(_RunPolicyResponse_QNAME, RunPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiskSafe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "diskSafe")
    public JAXBElement<DiskSafe> createDiskSafe(DiskSafe value) {
        return new JAXBElement<DiskSafe>(_DiskSafe_QNAME, DiskSafe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefreshPolicyFromDiskSafeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "refreshPolicyFromDiskSafeResponse")
    public JAXBElement<RefreshPolicyFromDiskSafeResponse> createRefreshPolicyFromDiskSafeResponse(RefreshPolicyFromDiskSafeResponse value) {
        return new JAXBElement<RefreshPolicyFromDiskSafeResponse>(_RefreshPolicyFromDiskSafeResponse_QNAME, RefreshPolicyFromDiskSafeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDiskSafeVerificationByPolicyIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runDiskSafeVerificationByPolicyIDResponse")
    public JAXBElement<RunDiskSafeVerificationByPolicyIDResponse> createRunDiskSafeVerificationByPolicyIDResponse(RunDiskSafeVerificationByPolicyIDResponse value) {
        return new JAXBElement<RunDiskSafeVerificationByPolicyIDResponse>(_RunDiskSafeVerificationByPolicyIDResponse_QNAME, RunDiskSafeVerificationByPolicyIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePolicyById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "deletePolicyById")
    public JAXBElement<DeletePolicyById> createDeletePolicyById(DeletePolicyById value) {
        return new JAXBElement<DeletePolicyById>(_DeletePolicyById_QNAME, DeletePolicyById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownObjectFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "UnknownObjectFault")
    public JAXBElement<UnknownObjectFault> createUnknownObjectFault(UnknownObjectFault value) {
        return new JAXBElement<UnknownObjectFault>(_UnknownObjectFault_QNAME, UnknownObjectFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "createPolicy")
    public JAXBElement<CreatePolicy> createCreatePolicy(CreatePolicy value) {
        return new JAXBElement<CreatePolicy>(_CreatePolicy_QNAME, CreatePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyById")
    public JAXBElement<GetPolicyById> createGetPolicyById(GetPolicyById value) {
        return new JAXBElement<GetPolicyById>(_GetPolicyById_QNAME, GetPolicyById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyIDs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyIDs")
    public JAXBElement<GetPolicyIDs> createGetPolicyIDs(GetPolicyIDs value) {
        return new JAXBElement<GetPolicyIDs>(_GetPolicyIDs_QNAME, GetPolicyIDs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDiskSafeVerification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runDiskSafeVerification")
    public JAXBElement<RunDiskSafeVerification> createRunDiskSafeVerification(RunDiskSafeVerification value) {
        return new JAXBElement<RunDiskSafeVerification>(_RunDiskSafeVerification_QNAME, RunDiskSafeVerification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "createPolicyResponse")
    public JAXBElement<CreatePolicyResponse> createCreatePolicyResponse(CreatePolicyResponse value) {
        return new JAXBElement<CreatePolicyResponse>(_CreatePolicyResponse_QNAME, CreatePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "updatePolicy")
    public JAXBElement<UpdatePolicy> createUpdatePolicy(UpdatePolicy value) {
        return new JAXBElement<UpdatePolicy>(_UpdatePolicy_QNAME, UpdatePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyByDiskSafeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyByDiskSafeId")
    public JAXBElement<GetPolicyByDiskSafeId> createGetPolicyByDiskSafeId(GetPolicyByDiskSafeId value) {
        return new JAXBElement<GetPolicyByDiskSafeId>(_GetPolicyByDiskSafeId_QNAME, GetPolicyByDiskSafeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnablePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "enablePolicyResponse")
    public JAXBElement<EnablePolicyResponse> createEnablePolicyResponse(EnablePolicyResponse value) {
        return new JAXBElement<EnablePolicyResponse>(_EnablePolicyResponse_QNAME, EnablePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileExclusionProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "fileExclusionProperty")
    public JAXBElement<FileExclusionProperty> createFileExclusionProperty(FileExclusionProperty value) {
        return new JAXBElement<FileExclusionProperty>(_FileExclusionProperty_QNAME, FileExclusionProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnablePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "enablePolicy")
    public JAXBElement<EnablePolicy> createEnablePolicy(EnablePolicy value) {
        return new JAXBElement<EnablePolicy>(_EnablePolicy_QNAME, EnablePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Policy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "policy")
    public JAXBElement<Policy> createPolicy(Policy value) {
        return new JAXBElement<Policy>(_Policy_QNAME, Policy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDiskSafeVerificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runDiskSafeVerificationResponse")
    public JAXBElement<RunDiskSafeVerificationResponse> createRunDiskSafeVerificationResponse(RunDiskSafeVerificationResponse value) {
        return new JAXBElement<RunDiskSafeVerificationResponse>(_RunDiskSafeVerificationResponse_QNAME, RunDiskSafeVerificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisablePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "disablePolicyResponse")
    public JAXBElement<DisablePolicyResponse> createDisablePolicyResponse(DisablePolicyResponse value) {
        return new JAXBElement<DisablePolicyResponse>(_DisablePolicyResponse_QNAME, DisablePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "exchangeSettings")
    public JAXBElement<ExchangeSettings> createExchangeSettings(ExchangeSettings value) {
        return new JAXBElement<ExchangeSettings>(_ExchangeSettings_QNAME, ExchangeSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveScheduleInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "archiveScheduleInstance")
    public JAXBElement<ArchiveScheduleInstance> createArchiveScheduleInstance(ArchiveScheduleInstance value) {
        return new JAXBElement<ArchiveScheduleInstance>(_ArchiveScheduleInstance_QNAME, ArchiveScheduleInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SqlServerSettings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "sqlServerSettings")
    public JAXBElement<SqlServerSettings> createSqlServerSettings(SqlServerSettings value) {
        return new JAXBElement<SqlServerSettings>(_SqlServerSettings_QNAME, SqlServerSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "deletePolicyResponse")
    public JAXBElement<DeletePolicyResponse> createDeletePolicyResponse(DeletePolicyResponse value) {
        return new JAXBElement<DeletePolicyResponse>(_DeletePolicyResponse_QNAME, DeletePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPoliciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPoliciesResponse")
    public JAXBElement<GetPoliciesResponse> createGetPoliciesResponse(GetPoliciesResponse value) {
        return new JAXBElement<GetPoliciesResponse>(_GetPoliciesResponse_QNAME, GetPoliciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaskExecutionContext }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "taskExecutionContext")
    public JAXBElement<TaskExecutionContext> createTaskExecutionContext(TaskExecutionContext value) {
        return new JAXBElement<TaskExecutionContext>(_TaskExecutionContext_QNAME, TaskExecutionContext.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunDiskSafeVerificationByPolicyID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runDiskSafeVerificationByPolicyID")
    public JAXBElement<RunDiskSafeVerificationByPolicyID> createRunDiskSafeVerificationByPolicyID(RunDiskSafeVerificationByPolicyID value) {
        return new JAXBElement<RunDiskSafeVerificationByPolicyID>(_RunDiskSafeVerificationByPolicyID_QNAME, RunDiskSafeVerificationByPolicyID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "updatePolicyResponse")
    public JAXBElement<UpdatePolicyResponse> createUpdatePolicyResponse(UpdatePolicyResponse value) {
        return new JAXBElement<UpdatePolicyResponse>(_UpdatePolicyResponse_QNAME, UpdatePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyByIdResponse")
    public JAXBElement<GetPolicyByIdResponse> createGetPolicyByIdResponse(GetPolicyByIdResponse value) {
        return new JAXBElement<GetPolicyByIdResponse>(_GetPolicyByIdResponse_QNAME, GetPolicyByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisablePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "disablePolicy")
    public JAXBElement<DisablePolicy> createDisablePolicy(DisablePolicy value) {
        return new JAXBElement<DisablePolicy>(_DisablePolicy_QNAME, DisablePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyIDsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyIDsResponse")
    public JAXBElement<GetPolicyIDsResponse> createGetPolicyIDsResponse(GetPolicyIDsResponse value) {
        return new JAXBElement<GetPolicyIDsResponse>(_GetPolicyIDsResponse_QNAME, GetPolicyIDsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunPolicyByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "runPolicyByIDResponse")
    public JAXBElement<RunPolicyByIDResponse> createRunPolicyByIDResponse(RunPolicyByIDResponse value) {
        return new JAXBElement<RunPolicyByIDResponse>(_RunPolicyByIDResponse_QNAME, RunPolicyByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePolicyByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "deletePolicyByIdResponse")
    public JAXBElement<DeletePolicyByIdResponse> createDeletePolicyByIdResponse(DeletePolicyByIdResponse value) {
        return new JAXBElement<DeletePolicyByIdResponse>(_DeletePolicyByIdResponse_QNAME, DeletePolicyByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyByDiskSafeIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://policy.apiV2.server.backup.r1soft.com/", name = "getPolicyByDiskSafeIdResponse")
    public JAXBElement<GetPolicyByDiskSafeIdResponse> createGetPolicyByDiskSafeIdResponse(GetPolicyByDiskSafeIdResponse value) {
        return new JAXBElement<GetPolicyByDiskSafeIdResponse>(_GetPolicyByDiskSafeIdResponse_QNAME, GetPolicyByDiskSafeIdResponse.class, null, value);
    }

}
