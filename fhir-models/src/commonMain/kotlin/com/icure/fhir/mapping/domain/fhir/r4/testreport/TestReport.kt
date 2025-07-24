//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.testreport

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the results of a TestScript execution
 *
 * A summary of information based on the results of executing a TestScript.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier External identifier
 * @param name Informal name of the executed TestScript
 * @param status completed | in-progress | waiting | stopped | entered-in-error
 * @param testScript Reference to the  version-specific TestScript that was executed to produce this
 * TestReport
 * @param result pass | fail | pending
 * @param score The final score (percentage of tests passed) resulting from the execution of the
 * TestScript
 * @param tester Name of the tester producing this report (Organization or individual)
 * @param issued When the TestScript was executed and this TestReport was generated
 * @param setup The results of the series of required setup operations before the tests were
 * executed
 * @param teardown The results of running the series of required clean up steps
 */
@SerialName("TestReport")
@Serializable
public data class TestReport(
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
   * External identifier
   */
  public val identifier: Identifier? = null,
  /**
   * Informal name of the executed TestScript
   */
  public val name: String? = null,
  /**
   * completed | in-progress | waiting | stopped | entered-in-error
   */
  public val status: String? = null,
  /**
   * Reference to the  version-specific TestScript that was executed to produce this TestReport
   */
  public val testScript: Reference,
  /**
   * pass | fail | pending
   */
  public val result: String? = null,
  /**
   * The final score (percentage of tests passed) resulting from the execution of the TestScript
   */
  public val score: Float? = null,
  /**
   * Name of the tester producing this report (Organization or individual)
   */
  public val tester: String? = null,
  /**
   * When the TestScript was executed and this TestReport was generated
   */
  public val issued: String? = null,
  public val participant: List<TestReportParticipant> = emptyList(),
  /**
   * The results of the series of required setup operations before the tests were executed
   */
  public val setup: TestReportSetup? = null,
  public val test: List<TestReportTest> = emptyList(),
  /**
   * The results of running the series of required clean up steps
   */
  public val teardown: TestReportTeardown? = null,
) : DomainResource
