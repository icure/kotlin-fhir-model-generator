//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.testplan

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript
 *
 * The test cases in a structured language e.g. gherkin, Postman, or FHIR TestScript.
 *
 * @param id Unique id for inter-element referencing
 * @param language The language for the test cases e.g. 'gherkin', 'testscript'
 * @param sourceString The actual content of the cases - references to TestScripts or externally
 * defined content
 * @param sourceReference The actual content of the cases - references to TestScripts or externally
 * defined content
 */
@SerialName("TestPlanTestCaseTestRunScript")
@Serializable
public data class TestPlanTestCaseTestRunScript(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The language for the test cases e.g. 'gherkin', 'testscript'
   */
  public val language: CodeableConcept? = null,
  /**
   * The actual content of the cases - references to TestScripts or externally defined content
   */
  public val sourceString: String? = null,
  /**
   * The actual content of the cases - references to TestScripts or externally defined content
   */
  public val sourceReference: Reference? = null,
) : BackboneElement
