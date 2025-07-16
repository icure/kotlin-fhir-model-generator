//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.testscript

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes a set of tests
 *
 * A structured set of tests against a FHIR server or client implementation to determine compliance
 * against the FHIR specification.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this test script, represented as a URI (globally unique)
 * @param identifier Additional identifier for the test script
 * @param version Business version of the test script
 * @param name Name for this test script (computer friendly)
 * @param title Name for this test script (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the test script
 * @param purpose Why this test script is defined
 * @param copyright Use and/or publishing restrictions
 * @param metadata Required capability that is assumed to function correctly on the FHIR server
 * being tested
 * @param setup A series of required setup operations before tests are executed
 * @param teardown A series of required clean up steps
 */
@SerialName("TestScript")
@Serializable
public data class TestScript(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Canonical identifier for this test script, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Additional identifier for the test script
   */
  public val identifier: Identifier? = null,
  /**
   * Business version of the test script
   */
  public val version: String? = null,
  /**
   * Name for this test script (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this test script (human friendly)
   */
  public val title: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the test script
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this test script is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  public val origin: List<TestScriptOrigin> = emptyList(),
  public val destination: List<TestScriptDestination> = emptyList(),
  /**
   * Required capability that is assumed to function correctly on the FHIR server being tested
   */
  public val metadata: TestScriptMetadata? = null,
  public val fixture: List<TestScriptFixture> = emptyList(),
  public val profile: List<Reference> = emptyList(),
  public val variable: List<TestScriptVariable> = emptyList(),
  /**
   * A series of required setup operations before tests are executed
   */
  public val setup: TestScriptSetup? = null,
  public val test: List<TestScriptTest> = emptyList(),
  /**
   * A series of required clean up steps
   */
  public val teardown: TestScriptTeardown? = null,
) : DomainResource
