//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.testscript

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A setup operation or assert to perform
 *
 * Action would contain either an operation or an assertion.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The setup operation to perform
 * @param assert_fhir The assertion to perform
 */
@SerialName("TestScriptSetupAction")
@Serializable
public data class TestScriptSetupAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The setup operation to perform
   */
  public val operation: TestScriptSetupActionOperation? = null,
  /**
   * The assertion to perform
   */
  @JsonNames("assert")
  public val assert_fhir: TestScriptSetupActionAssert? = null,
) : BackboneElement
