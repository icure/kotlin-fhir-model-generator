//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.operationoutcome

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param severity fatal | error | warning | information
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
   * fatal | error | warning | information
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
