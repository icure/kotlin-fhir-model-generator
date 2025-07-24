//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.operationoutcome

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A single issue associated with the action
 *
 * An error, warning, or information message that results from a system action.
 *
 * @param id Unique id for inter-element referencing
 * @param severity fatal | error | warning | information | success
 * @param code Error or warning code
 * @param details Additional details about the error
 * @param diagnostics Additional diagnostic information about the issue
 */
@SerialName("OperationOutcomeIssue")
@Serializable
public data class OperationOutcomeIssue(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * fatal | error | warning | information | success
   */
  public val severity: String? = null,
  /**
   * Error or warning code
   */
  public val code: String? = null,
  /**
   * Additional details about the error
   */
  public val details: CodeableConcept? = null,
  /**
   * Additional diagnostic information about the issue
   */
  public val diagnostics: String? = null,
  public val location: List<String> = emptyList(),
  public val expression: List<String> = emptyList(),
) : BackboneElement
