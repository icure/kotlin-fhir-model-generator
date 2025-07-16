//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testreport

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * One or more teardown operations performed
 *
 * The teardown action will only contain an operation.
 *
 * @param id Unique id for inter-element referencing
 * @param operation The teardown operation performed
 */
@SerialName("TestReportTeardownAction")
@Serializable
public data class TestReportTeardownAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The teardown operation performed
   */
  public val operation: TestReportSetupActionOperation,
) : BackboneElement
