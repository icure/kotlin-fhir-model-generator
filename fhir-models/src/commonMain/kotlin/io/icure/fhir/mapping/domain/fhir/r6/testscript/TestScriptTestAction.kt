//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testscript

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A test operation or assert to perform
 *
 * Action would contain either an operation or an assertion.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The setup operation to perform
 * @param assert_fhir The setup assertion to perform
 */
@SerialName("TestScriptTestAction")
@Serializable
public data class TestScriptTestAction(
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
   * The setup assertion to perform
   */
  @JsonNames("assert")
  public val assert_fhir: TestScriptSetupActionAssert? = null,
) : BackboneElement
